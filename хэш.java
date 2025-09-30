Хэш-таблицы на JAVA:

import java.util.Hashtable; 
public class GFG {   
public static void main(String args) { 
// Создать хэш-таблицу с ключами String и значениями Integer 
Hashtable<String, Integer> ht = new Hashtable<>(); 
// Добавить элементы в хэш-таблицу 
ht.put("One", 1); 
ht.put("Two", 2); 
ht.put("Three", 3); 
// Отобразить элементы хэш-таблицы 
System.out.println("Hashtable Elements: " + ht); 
} 
}

import java.util.HashMap; 
public class ExampleHashMap { 
public static void main(String args) { 
// Создать HashMap 
HashMap<String, Integer> hashMap = new HashMap<>(); 
// Добавить элементы в HashMap 
hashMap.put("John", 25); 
hashMap.put("Jane", 30); 
hashMap.put("Jim", 35); 
// Доступ к элементам в HashMap 
System.out.println(hashMap.get("John")); 
// Удалить элемент из HashMap 
hashMap.remove("Jim"); 
// Проверить, есть ли элемент в HashMap 
System.out.println(hashMap.containsKey("Jim")); 
// Получить размер HashMap 
System.out.println(hashMap.size()); 
} 
} 