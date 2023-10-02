---
layout: post
title: The JVM and JDK
---

Java (and Clojure) code is not executed directly. Instead, it is compiled into an architecture-independent binary format which is executed
by a Java Virtual Machine (JVM). The behaviour of the JVM is defined by the [Java Virtual Machine Specification](https://docs.oracle.com/javase/specs/jvms/se20/html/index.html).
Multiple implementations of this standard are available.

Java source files are converted to their binary representation (called .class files) by a compiler, `javac`. `javac`, along with various other tools used for Java development are included in the Java Development Kit (JDK).
Each release of the Java platform has a corresponding JDK for development.

## Java Virtual Machine

## Java Development Kit