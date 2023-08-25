---
layout: post
title: Java
---

# Java

Java is a statically-typed object-oriented language. Java programs are organised as a collection of classes and interfaces. Classes extend a single superclass, implement a number of interfaces, and define various fields and methods.
Interfaces can declare any number of super-interfaces, along with methods that implementing classes must define.

__Greet.java__
{% highlight java %}
{% include code/basic_java/Greet.java %}
{% endhighlight %}

This file can be compiled with `javac`:

    $ javac Greet.java

This outputs a `Greet.class` file in the current directory. The `main` method can be invoked with:

    $ java Greet "world!"
    Hello world!

## Entry point

## Locating classes

### Classpath

### Bootstrap classloader