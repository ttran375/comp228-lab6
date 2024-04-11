# Lab Assignment 6: Developing Multithreaded Applications using Java

## Multithreading API and Collections API

Purpose: The purpose of this Lab assignment is to:

- Practice Multithreaded application development.

- Develop a Multithreaded GUI Java application using Collection API.

### **<u>Exercise 1:</u>**

This exercise is similar to PrintTask example from Week 12.

Write a Java application that handles multiple ATM transactions
(withdraw, deposit) at the same time. Create an **Account** class and
implement both **deposit** and **withdraw** operations. Synchronize the
operations to allow thread synchronization. Use Java Runnable interface
to implement a **Transaction** class. Perform **withdraw** and deposit
**operations** in **run** method.

Create an **AccountTest** class to test multiple transactions (threads).
Use an ArrayList to create a list of three or more Transaction objects.
Use method **execute** of ExecutorService to execute the threads.
Display the results.

> (10 marks)

**Evaluation:**

<table>
<colgroup>
<col style="width: 50%" />
<col style="width: 49%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Functionality</strong></th>
<th></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><blockquote>
<p>Correct implementation of Multithreading</p>
</blockquote></td>
<td>50%</td>
</tr>
<tr class="even">
<td><blockquote>
<p>Correct implementation of Collections API</p>
</blockquote></td>
<td>30%</td>
</tr>
<tr class="odd">
<td><blockquote>
<p>Comments, correct naming of variables, methods, classes, etc.</p>
</blockquote></td>
<td>5%</td>
</tr>
<tr class="even">
<td><strong>Friendly input/output</strong></td>
<td>15%</td>
</tr>
<tr class="odd">
<td><strong>Total</strong></td>
<td>100%</td>
</tr>
</tbody>
</table>
