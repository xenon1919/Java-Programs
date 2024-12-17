import java.util.*;

class JobSequencingWithDeadline implements Comparable<JobSequencingWithDeadline> {
    String name;
    int profit, deadline;

    JobSequencingWithDeadline(String name, int profit, int deadline) {
        this.name = name;
        this.profit = profit;
        this.deadline = deadline;
    }

    public int compareTo(JobSequencingWithDeadline other) {
        return Integer.compare(other.profit, this.profit);
    }
}

class JobSequencingWithDeadlines {
    static List<JobSequencingWithDeadline> jobSequence(List<JobSequencingWithDeadline> jobs) {
        Collections.sort(jobs);

        int maxDeadline = jobs.stream().mapToInt(job -> job.deadline).max().orElse(0);
        boolean[] slots = new boolean[maxDeadline];
        List<JobSequencingWithDeadline> sequence = new ArrayList<>();

        for (JobSequencingWithDeadline job : jobs) {
            int deadline = job.deadline;
            while (deadline > 0 && slots[deadline - 1]) {
                deadline--;
            }

            if (deadline > 0) {
                slots[deadline - 1] = true;
                sequence.add(job);
            }
        }

        return sequence;
    }

    public static void main(String[] args) {
        List<JobSequencingWithDeadline> jobs = new ArrayList<>();
        jobs.add(new JobSequencingWithDeadline("Job1", 35, 3));
        jobs.add(new JobSequencingWithDeadline("Job2", 30, 4));
        jobs.add(new JobSequencingWithDeadline("Job3", 25, 4));
        jobs.add(new JobSequencingWithDeadline("Job4", 20, 2));
        jobs.add(new JobSequencingWithDeadline("Job5", 15, 3));
        jobs.add(new JobSequencingWithDeadline("Job6", 12, 1));

        List<JobSequencingWithDeadline> sequence = jobSequence(jobs);
        System.out.println("Job Sequence with Deadlines (Maximizing Profit):");
        for (JobSequencingWithDeadline job : sequence) {
            System.out.println(job.name);
        }
    }
}
