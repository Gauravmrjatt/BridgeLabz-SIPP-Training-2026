interface TextModeration {
    boolean checkOffensive(String post);
    default void displayModerationPolicy() {
        System.out.println("Text Moderation Policy: No hate speech, harassment, or profanity.");
    }
}

interface SpamDetection {
    boolean checkSpam(String post);
    default void displayModerationPolicy() {
        System.out.println("Spam Detection Policy: No repetitive, promotional, or misleading content.");
    }
    static boolean containsRestrictedWords(String post) {
        String[] restricted = {"buy now", "click here", "free money", "win prize", "subscribe"};
        String lower = post.toLowerCase();
        for (String word : restricted) {
            if (lower.contains(word)) return true;
        }
        return false;
    }
}

class ContentModerator implements TextModeration, SpamDetection {
    public boolean checkOffensive(String post) {
        String[] offensive = {"fuck", "shit", "ass", "damn", "idiot"};
        String lower = post.toLowerCase();
        for (String word : offensive) {
            if (lower.contains(word)) return true;
        }
        return false;
    }

    public boolean checkSpam(String post) {
        return SpamDetection.containsRestrictedWords(post);
    }

    public void displayModerationPolicy() {
        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }
}

class ContentModeratorDemo {
    public static void main(String[] args) {
        String[] posts = {
            "Hello everyone, nice to meet you!",
            "Click here to win free money now!",
            "This is fucking awful service.",
            "Check out my new blog post about coding.",
            "Buy now and get a free prize!!!"
        };
        ContentModerator cm = new ContentModerator();
        cm.displayModerationPolicy();
        System.out.println();
        for (String post : posts) {
            System.out.print("Post: \"" + post + "\"");
            boolean isSpam = cm.checkSpam(post);
            boolean isOffensive = cm.checkOffensive(post);
            if (isSpam) {
                System.out.println(" -> Spam");
            } else if (isOffensive) {
                System.out.println(" -> Offensive");
            } else {
                System.out.println(" -> Valid");
            }
        }
    }
}
