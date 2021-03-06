package org.egov.bootcamp.model;

public class Node<T> {
    T value;
    Node<T> next;

    public Node(T element) {
        this.value = element;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node<?> node = (Node<?>) o;

        return !(this.value != null ? !this.value.equals(node.getValue()) : node.getValue() != null);
    }


    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }
}
