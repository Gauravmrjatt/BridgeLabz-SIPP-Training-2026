package leetcode;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

interface NestedInteger {
    boolean isInteger();
    Integer getInteger();
    List<NestedInteger> getList();
}

public class NestedIterator implements Iterator<Integer> {
    private Stack<NestedInteger> stack;

    public NestedIterator(List<NestedInteger> nestedList) {
        stack = new Stack<>();
        pushToStack(nestedList);
    }

    private void pushToStack(List<NestedInteger> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            stack.push(list.get(i));
        }
    }

    @Override
    public Integer next() {
        return stack.pop().getInteger();
    }

    @Override
    public boolean hasNext() {
        while (!stack.isEmpty()) {
            NestedInteger ni = stack.peek();
            if (ni.isInteger()) {
                return true;
            }
            stack.pop();
            pushToStack(ni.getList());
        }
        return false;
    }
}
