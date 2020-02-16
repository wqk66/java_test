package com.java.collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

    public static void main(String[] args) {

        ReverseList<String> list = new ReverseList<String>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("pear");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String value = it.next();
            System.out.println(value);
        }
    }
}

/**
 * 
 * @Description: 自定义list,用于反向查询
 * @author: wqk
 * @date: 2019下午6:27:35
 * @version: 1.0
 * @param <T>
 */
class ReverseList<T> implements Iterable<T> {

    private List<T> list;

    public ReverseList() {
        super();
        list = new ArrayList<T>();
    }

    public void add(T t) {
        list.add(t);
    }

    @Override
    public Iterator<T> iterator() {
        return new ReverseIterator(list.size());
    }

    /**
     * 
     * @Description: 自定义迭代器
     * @author: wqk
     * @date: 2019下午6:28:19
     * @version: 1.0
     */
    class ReverseIterator implements Iterator<T> {

        int index = 0;

        ReverseIterator(int index) {
            this.index = index;
        }

        @Override
        public boolean hasNext() {

            return index > 0;
        }

        @Override
        public T next() {
            index--;
            //            return ReverseList.this.list.get(ReverseList.this.list.size() - (index + 1));
            return ReverseList.this.list.get(index);
        }
    }

}