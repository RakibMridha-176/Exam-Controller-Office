# Exam-Controller-Office

Exam controller office plays an important role in arranging exams. In a university, the examiners
send all the exam scripts and corresponding marksheets to the exam controller office after
checking the exam scripts. The exam controller office scrutinizes the marks and correct
mistakes (if any). Then it publishes the results to the students. If a student thinks that he/she
should have got more marks in an exam than he/she got, he/she can apply for re-examine. The
exam controller office then sends the corresponding exam script to the corresponding teacher.
The teacher re-examines the script and let the exam controller office know if there is any
change (increase or decrease) in marks. The exam controller office then lets the student know
the results of re-examine and update the mark if there is any change.

Possible Input-Output: For simplicity, consider 5 students and an examiner. Assume that the
examiner has already checked the exam scripts of the 5 students. The examiner sends the exam
scripts of them and corresponding marks (as a list) to the exam controller office (i.e. print
“scripts and marks of student id 1,2,3,4,5 sent to exam controller office”). Print all the student
IDs and corresponding marks from the exam controller side after exam controller office gets the
documents. Set the probability of mistake in marking to 0.5 or 0.6 and randomly generate cases
of mistakes. Make sure that at least one case of mistake is generated in a total of 5 cases. Print
the case of mistake mentioning student ID, previous mark, and corrected mark. Now publish
the results to the 5 students. Instances of “Student” class will print their individual mark now. In
case of re-examine, take input to generate a re-examine request. The input will decide which
student will apply for re-examine. The request should go through the student side (i.e. print
“re-examine request sent from student id 1”) and should be printed from the exam controller
side (i.e. print “re-examine request got from student id 1”). Same type of communication
should be followed elsewhere.

Tasks:
• Identify the design pattern that can best capture the scenario above.
• Implement the scenario in your preferred language. Java is recommended. You
have to be able to run and demonstrate your code in the lab, so prepare your
setup before evaluation.
• Marks will depend on how the code is implemented. The code can run as
instructed, and yet fail to use the appropriate pattern. No marks will be
awarded in that case.
• Keep all files in a folder, zip it, and submit the zipped file in classroom.
