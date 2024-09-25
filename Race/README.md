
# Mini-Project: Hare and Tortoise Race

## Project Overview

The **Hare and Tortoise Race** is a simple multi-threading project designed to simulate a race between two competitors: the Hare and the Tortoise. This project explores thread creation, control mechanisms, and thread priorities in Java.

## Objectives

1. **Thread Creation**: Implement two threads for the Hare and Tortoise using both the Thread class and the Runnable interface.
2. **Race Simulation**: Simulate a race where each thread runs 100 meters, determining which one finishes first.
3. **Thread Control**: Stop the thread that does not win the race once one thread finishes.
4. **Thread Priorities**: Set a higher priority for the Hare thread and observe the impact on the race outcome.
5. **Thread Sleep**: Implement a sleep mechanism for the Hare thread after it has run 60 meters, examining how it affects the race.

## Implementation Details

### 1. Thread Creation

Threads can be created in Java in two primary ways:

- **Extending the Thread Class**: Create a new class that extends the `Thread` class and override its `run()` method.
- **Implementing the Runnable Interface**: Create a class that implements the `Runnable` interface and define the `run()` method.

### 2. Running the Race

Each thread simulates running a distance of 100 meters using a `for` loop. Inside the loop, we will print how far each thread has run, which allows us to observe the race progress.

### 3. Race Logic

- Start both threads simultaneously.
- The first thread to complete 100 meters will be declared the winner.
- Once a thread finishes, the other thread should be stopped.

### 4. Priority Management

- Assign a high priority to the Hare thread.
- Observe the outcome of the race with the adjusted priority.

### 5. Adding Sleep

- Introduce a sleep period for the Hare thread after it has covered 60 meters. This simulates a delay that could affect the race outcome.
- Re-run the race to see how the sleep affects the final results.

### Example Output

The output of the race can be formatted to show the progress of both the Hare and the Tortoise. For instance:

```
Hare: 10 meters
Tortoise: 5 meters
Hare: 20 meters
Tortoise: 10 meters
...
Hare: 60 meters (sleeps for 1 second)
...
Tortoise: 100 meters - Tortoise wins the race!
```

## Conclusion

The **Hare and Tortoise Race** project not only demonstrates the principles of multi-threading in Java but also offers practical experience with thread management and synchronization. By experimenting with thread priorities and sleep intervals, users can gain insights into how these factors influence concurrent programming.
