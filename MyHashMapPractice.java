/*
s706. Design HashMap (LeetCode)

Design a HashMap without using any built-in hash table libraries.

Implement the MyHashMap class:

MyHashMap() initializes the object with an empty map.
void put(int key, int value) inserts a (key, value) pair into the HashMap. If the key already exists in the map, update the corresponding value.
int get(int key) returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
void remove(key) removes the key and its corresponding value if the map contains the mapping for the key.
 

Input
["MyHashMap", "put", "put", "get", "get", "put", "get", "remove", "get"]
[[], [1, 1], [2, 2], [1], [3], [2, 1], [2], [2], [2]]
Output
[null, null, null, 1, -1, null, 1, null, -1]

Explanation
MyHashMap myHashMap = new MyHashMap();
myHashMap.put(1, 1); // The map is now [[1,1]]
myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
myHashMap.get(1);    // return 1, The map is now [[1,1], [2,2]]
myHashMap.get(3);    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
myHashMap.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the existing value)
myHashMap.get(2);    // return 1, The map is now [[1,1], [2,1]]
myHashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
myHashMap.get(2);    // return -1 (i.e., not found), The map is now [[1,1]]*/


package com.sorting;

import java.util.LinkedList;

public class MyHashMapPractice {

	public static void main(String args[]) {

		MyCustomHashMap2 mycustomHashMap = new MyCustomHashMap2();
		mycustomHashMap.put(1, 1);
		mycustomHashMap.remove(2);
		System.out.println();
	}

}

class MyCustomHashMap2 {
	
	LinkedList[] map;
	public int SIZE = 769;

	public MyCustomHashMap2() {
		map = new LinkedList[SIZE];    
	}

	public void put(int key, int value) {
		int bucket = key % SIZE;
		LinkedList<Entry> entries;
		if(map[bucket] == null) {
			entries = new LinkedList<Entry>();
			entries.add(new Entry(key,value));
		}
		else {
			entries = map[bucket];
			for(Entry entry : entries) {
				if(entry.key == key) {
					entry.value = value;
				}
			}
		}
	}

	public int get(int key) {
		int bucket = key % SIZE;
		if(map[bucket] == null)
			return -1;
		
		LinkedList<Entry> entries = map[bucket];
		for(Entry entry : entries) {
			if(entry.key == key) {
				return entry.value;
			}			
		}
		return -1;
	}

	public void remove(int key) {
		int bucket = key % SIZE;
		Entry removeEntry = null;
		if(map[bucket] == null) {
			return;
		}
		LinkedList<Entry> entries = map[bucket];
		for(Entry entry : entries) {
			if(entry.key == key) {
				removeEntry = entry;
				entries.remove(removeEntry);
			}			
		}
		return;
	}
}

class Entry{
	int key;
	int value;
	Entry(int key, int value){
		this.key = key;
		this.value = value;
	}
}