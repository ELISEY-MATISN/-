1) Бинарная куча (binary heap)

class BinaryHeap:
    def __init__(self):
        self.a = []

    def _sift_up(self, i):
        while i > 0:
            p = (i - 1) // 2
            if self.a[i] < self.a[p]:
                self.a[i], self.a[p] = self.a[p], self.a[i]
                i = p
            else:
                break

2) Биномиальная куча (binomial heap)

class BinomialNode:
    def __init__(self, key):
        self.key = key
        self.parent = None
        self.child = None  # leftmost child
        self.sibling = None  # right sibling
        self.degree = 0

def link(b1, b2):
    # make b2 a child of b1 (assuming b1.key <= b2.key)
    b2.parent = b1
    b2.sibling = b1.child
    b1.child = b2
    b1.degree += 1
    return b1

3) Куча Фибоначчи (Fibonacci heap)

class FibNode:
    def __init__(self, key):
        self.key = key
        self.degree = 0
        self.mark = False
        self.parent = None
        # circular doubly linked list pointers
        self.left = self
        self.right = self
        self.child = None

def _add_to_root_list(min_ptr, node):
    if not min_ptr:
        return node