1) Бинарная куча (binary heap)

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class BinaryHeap<T extends Comparable<T>> {
    private List<T> a = new ArrayList<>();

2) Биномиальная куча (binomial heap)

class BNode<T extends Comparable<T>> {
    T key;
    int degree = 0;
    BNode<T> parent, child, sibling;
    BNode(T k) { key = k; }
}

public class BinomialHeap<T extends Comparable<T>> {
    private BNode<T> head;

3) Куча Фибоначчи (Fibonacci heap)

class FibNode<T extends Comparable<T>> {
    T key;
    int degree;
    boolean mark;
    FibNode<T> parent, child, left, right;
    FibNode(T k) { key = k; left = right = this; }
}

public class FibonacciHeap<T extends Comparable<T>> {
    private FibNode<T> min;
    private int n;
template<typename T>
class FibonacciHeap {
    FNode<T>* min = nullptr;
    int n = 0;