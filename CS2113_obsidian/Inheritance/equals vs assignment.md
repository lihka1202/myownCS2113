Consider the following variables:

```
Time time1 = new Time(9, 30, 0);
Time time2 = time1;
Time time3 = new Time(9, 30, 0);

```

-   The assignment operator copies references, so `time1` and `time2` refer to the same object. Because they are identical, `time1 == time2` is `true`.
- But `time1` and `time3` refer to different objects. Because they are not identical, `time1 == time3` is `false`.

**By default the equals method does the same thing as == ,** however since the meaning of equivalence can differ from class to class, you can **override the equals method**. This can be done in the following manner, following the information from the [[Method Overloading and Overriding]].

```
public class Time {
    int hours;
    int minutes;
    int seconds;

    // ...

    @Override
    public boolean equals(Object o) {
        Time other = (Time) o;
        return this.hours == other.hours
                && this.minutes == other.minutes
                && this.seconds == other.seconds;
    }
}

```

This has been modified in such a way that as long as both the objects contain the same times of the day, they are certified to be **equal**.

However, **A proper equals method is even harder to implement, so check out this link to understand more**: https://www.sitepoint.com/implement-javas-equals-method-correctly/

