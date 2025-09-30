1) Бинарная куча (binary heap)

#include <vector>
#include <stdexcept>

template<typename T>
class BinaryHeap {
    std::vector<T> a;
    void sift_up(int i) {
        while (i > 0) {
            int p = (i - 1) / 2;
            if (a[i] < a[p]) { std::swap(a[i], a[p]); i = p; }
            else break;
        }
    }

2) Биномиальная куча (binomial heap)

#include <iostream>
#include <memory>

template<typename T>
struct BNode {
    T key;
    int degree = 0;
    BNode* parent = nullptr;
    BNode* child = nullptr;
    BNode* sibling = nullptr;
    BNode(T k): key(k){}
};

template<typename T>
class BinomialHeap {
    BNode<T>* head = nullptr;

3) Куча Фибоначчи (Fibonacci heap)

template<typename T>
struct FNode {
    T key;
    int degree = 0;
    bool mark = false;
    FNode* parent = nullptr;
    FNode* child = nullptr;
    FNode* left = this;
    FNode* right = this;
    FNode(T k): key(k) {}
};

template<typename T>
class FibonacciHeap {
    FNode<T>* min = nullptr;
    int n = 0;