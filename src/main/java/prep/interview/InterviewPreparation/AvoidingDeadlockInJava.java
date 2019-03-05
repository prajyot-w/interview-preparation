package prep.interview.InterviewPreparation;

/**
 * @Author prajyot on 3/3/19
 */
/*
This is one of the interesting programs from Java Interviews, mostly asked to 2 to 3 years of experienced programmers or
higher. Interviewer simply asked you to write code where a resource is accessed by multiple threads. You need to write
code in such a way that no deadlock should occur. The trick to solving this problem is acquiring resources in an order
and release them in reverse order e.g. first acquire resource R1 and only if you have got R1 go for R2. This way you can
avoid deadlock.
*/
public class AvoidingDeadlockInJava {
}
