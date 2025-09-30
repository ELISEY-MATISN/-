Хэш-таблицы на C++:

int main() { 
// Создать хэш-таблицу 
unordered_map<string, int> umap; 
// Вставить пары «ключ-значение» 
umap["Apple"] = 10; 
umap["Mango"] = 20; 
umap["Cherry"] = 30; 
// Распечатать пары «ключ-значение» 
for (auto it : umap) cout << it.first << " " << it.second << endl; 
return 0; 
} 

#include <iostream> 
#include <list> 
#include <functional> 
// Структура для хранения пары ключ-значение 
template<typename K, typename V> 
struct HashNode { 
K key; 
V value; 
HashNode(K k, V v) : key(k), value(v) {} 
}; 
// Класс хеш-таблицы 
template<typename K, typename V> 
class HashTable { 
private: 
std::list<HashNode<K, V>>* table; 
size_t capacity; 
size_t size; 
// Простая хеш-функция 
size_t hashFunction(const K& key) { 
return std::hash<K>()(key) % capacity; 
}