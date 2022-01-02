#!/bin/bash

directory=$(pwd)
cd ~/ubung*/src

echo "Directory: $(pwd)"

echo 'rm */*.class'
rm */*.class

echo -e 'Index\tJava File'
index=0
for file in exercise*/*Demo.java; do
	echo -e "$index\t\t$file"
	index=$((index + 1))
done

read -p 'Enter index: ' enteredIndex

index=0
for file in exercise*/*Demo.java; do
	if [[ "$index" == "$enteredIndex" ]]; then
		echo 'javac exercise11/Node.java exercise11/NodeUtils.java exercise11/LinkedQueue.java exercise11/LinkedQueueDemo.java exercise11/LinkedStack.java exercise11/LinkedStackDemo.java'
		javac exercise11/Node.java exercise11/NodeUtils.java exercise11/LinkedQueue.java exercise11/LinkedQueueDemo.java exercise11/LinkedStack.java exercise11/LinkedStackDemo.java
		class=$(echo $file | sed 's/.java//' | sed 's/\//./')
		echo "java -ea $class"
		echo -e "\U0001f680 \U0001f648 \U0001f649 \U0001f64A \U0001f680"
		java -ea $class
	else
		:
	fi

	index=$((index + 1))
done

cd $directory
