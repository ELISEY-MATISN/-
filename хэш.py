Хэш-таблицы на Python:

 
class HashTable: 
    def __init__(self, size): 
        self.size = size 
        self.table = [None]*size 
 
    def _hash(self, key): 
        return ord(key[0]) % self.size 
 
class HashTable: 
    def __init__(self, size): 
        self.size = size 
        self.table = [None]*size 
 
    def _hash(self, key): 
        return ord(key[0]) % self.size 
 
    def set(self, key, value): 
        hash_index = self._hash(key) 
        self.table[hash_index] = (key, value) 
 
    def get(self, key): 
        hash_index = self._hash(key) 
        if self.table[hash_index] is not None: 
            return self.table[hash_index][1] 
 
        raise KeyError(f'Key {key} not found') 
 
    def remove(self, key): 
        hash_index = self._hash(key) 
        if self.table[hash_index] is not None: 
            self.table[hash_index] = None 
        else: 
            raise KeyError(f'Key {key} not found')