package exercises;

import java.util.Arrays;

/* 
 * 1. Make the JobCandidate class implement Comparable.  
 * 2. Add a JobCandadate instance that represents yourself, and use compareTo() to see who should be given the job.
 * 
 */

import java.util.List;

public class JobCandidate implements Comparable<JobCandidate> {

	private List<String> personalityTraits;
	private int hoursSpentCoding;
	private String teacherName;
	private int salaryRequired;

	public JobCandidate(List<String> personalityTraits, int hoursSpentCoding, String teacherName, int salaryRequired) {
		super();
		this.personalityTraits = personalityTraits;
		this.hoursSpentCoding = hoursSpentCoding;
		this.teacherName = teacherName;
		this.salaryRequired = salaryRequired;
	}

	public static void main(String[] args) {
		JobCandidate june = new JobCandidate(Arrays.asList(new String[] { "adaptable", "scatty", "curious" }), 650,
				"Vinny Wade", 1200000);
		JobCandidate marina = new JobCandidate(Arrays.asList(new String[] { "responsible", "friendly", "team-mate" }),
				250, "June Clarke", 1000000);

		if (june.compareTo(marina) == 0)
			System.out.println("Both June and Marina are equaly good job candidates.");
		if (june.compareTo(marina) == 1)
			System.out.println("June is a way better job candidate than Marina. Congrats June!");
		if (june.compareTo(marina) == -1)
			System.out.println("Marina is a better job candidate than June. Just keep going Marina!");
	}

	@Override
	public int compareTo(JobCandidate jc) {

		int traits = 0;
		if (jc.personalityTraits.size() == personalityTraits.size())
			traits = 0;
		else if (jc.personalityTraits.size() < personalityTraits.size())
			traits = 1;
		else if (jc.personalityTraits.size() > personalityTraits.size())
			traits = -1;

		int hours = 0;
		if (jc.hoursSpentCoding == hoursSpentCoding)
			hours = 0;
		else if (jc.hoursSpentCoding < hoursSpentCoding)
			hours = 1;
		else if (jc.hoursSpentCoding > hoursSpentCoding)
			hours = -1;

		int salary = 0;
		if (jc.salaryRequired == salaryRequired)
			salary = 0;
		else if (jc.salaryRequired < salaryRequired)
			salary = 1;
		else if (jc.salaryRequired > salaryRequired)
			salary = -1;

		int candidateWhoGotTheJob = 0;
		if ((traits + hours + salary) == 0)
			candidateWhoGotTheJob = 0;
		else if ((traits + hours + salary) > 0)
			candidateWhoGotTheJob = 1;
		else if ((traits + hours + salary) < 0)
			candidateWhoGotTheJob = -1;

		return candidateWhoGotTheJob;
	}

}
