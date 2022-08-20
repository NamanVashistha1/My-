import java.util.Scanner;

public class QUIZ {

    public static void main(String[] args) {

       
        System.out.println("Select Quiz subject:");
        System.out.println("A.CHEMISTRY");
        System.out.println("B.BIOLOGY");
         char choice;
          Scanner scan = new Scanner(System.in);
            choice = scan.next().charAt(0);
          switch(choice)
            {
                case 'A':
                   Quiz quiz1 = new Quiz();
        quiz1.CHEM();
                    break;
                case 'B':
                   Quiz quiz2 = new Quiz();
        quiz2.BIO();
                    break;
            }
       
    }
}

class Quiz
{
    void CHEM()
    {
        Question[] questions = new Question[5];

        questions[0] = new Question("Which of the gas is not known as green house gas?","Methane","Nitrous oxide","Carbon dioxide","Hydrogen", new Answer("Hydrogen"));
        questions[1] = new Question("Bromine is a","black solid","red liquidred liquid","colourless gas","highly inflammable gas", new Answer("red liquid"));
        questions[2] = new Question("The hardest substance available on earth is","Gold","Iron","Diamond","Platinum", new Answer("Diamond"));
        questions[3] = new Question("Heavy water is","deuterium oxide","PH7","rain water","tritium oxide", new Answer("deuterium oxide"));
        questions[4] = new Question("Which is laughing gas?","Nitrous Oxide","Carbon monoxide","Sulphur dioxide","Hydrogen peroxide", new Answer("Nitrous Oxide"));

        int countTotal = 0;
        int countRight = 0;
        int countWrong = 0;

        for(Question q: questions)
        {
            System.out.println(q.getQuestion());
            System.out.println("A : " +q.getOption1());
            System.out.println("B : " +q.getOption2());
            System.out.println("C : " +q.getOption3());
            System.out.println("D : " +q.getOption4());

            String answer = "";

            char ans;
            System.out.println("Enter your answer");
            Scanner scan = new Scanner(System.in);
            ans = scan.next().charAt(0);

            switch(ans)
            {
                case 'A':
                    answer = q.getOption1();
                    break;
                case 'B':
                    answer = q.getOption2();
                    break;
                case 'C':
                    answer = q.getOption3();
                    break;
                case 'D':
                    answer = q.getOption4();
                    break;
                default:break;
            }
            System.out.println("Your answer " + answer + " " + q.getAnswer());
            if(answer.equals(q.getAnswer().getAnswer()))
            {
                System.out.println("------------------------------------------------------");
                System.out.println("                  Correct Answer                      ");
                System.out.println("------------------------------------------------------");
                countRight++;
            }
            else
            {
                System.out.println("------------------------------------------------------");
                System.out.println("                  Wrong Answer                      ");
                System.out.println("------------------------------------------------------");
                countWrong++;
            }
            System.out.println("============================================================================================");
            countTotal++;
        }

        Result result = new Result(countTotal,countRight,countWrong);
        result.showResult();
    }
     void BIO()
    {
        Question[] questions = new Question[5];

        questions[0] = new Question(" Fungi are plants that lack...","Oxygen","Carbon dioxide","Chlorophyll","Hydrogen", new Answer("Chlorophyll"));
        questions[1] = new Question("Which organ of the body produces the fluid known as bile?","Liver","Pancreas","Gall bladder","Kidney", new Answer("Liver"));
        questions[2] = new Question("Plants synthesis protein from","starch","sugar","amino acids","fatty acids", new Answer("amino acids"));        questions[3] = new Question("Heavy water is","deuterium oxide","PH7","rain water","tritium oxide", new Answer("deuterium oxide"));
        questions[3] = new Question("Photosynthesis takes place faster in","yellow light","white light","red light","darkness", new Answer("white light"));
        questions[4] = new Question("Most highly intelligent mammals are","whales","dolphins","elephants","kangaroos", new Answer("dolphins"));

        int countTotal = 0;
        int countRight = 0;
        int countWrong = 0;

        for(Question q: questions)
        {
            System.out.println(q.getQuestion());
            System.out.println("A : " +q.getOption1());
            System.out.println("B : " +q.getOption2());
            System.out.println("C : " +q.getOption3());
            System.out.println("D : " +q.getOption4());

            String answer = "";

            char ans;
            System.out.println("Enter your answer");
            Scanner scan = new Scanner(System.in);
            ans = scan.next().charAt(0);

            switch(ans)
            {
                case 'A':
                    answer = q.getOption1();
                    break;
                case 'B':
                    answer = q.getOption2();
                    break;
                case 'C':
                    answer = q.getOption3();
                    break;
                case 'D':
                    answer = q.getOption4();
                    break;
                default:break;
            }
            System.out.println("Your answer " + answer + " " + q.getAnswer());
            if(answer.equals(q.getAnswer().getAnswer()))
            {
                System.out.println("------------------------------------------------------");
                System.out.println("                  Correct Answer                      ");
                System.out.println("------------------------------------------------------");
                countRight++;
            }
            else
            {
                System.out.println("------------------------------------------------------");
                System.out.println("                  Wrong Answer                      ");
                System.out.println("------------------------------------------------------");
                countWrong++;
            }
            System.out.println("============================================================================================");
            countTotal++;
        }

        Result result = new Result(countTotal,countRight,countWrong);
        result.showResult();
    }
}

class Question
{

    String question;
    String option1;
    String option2;
    String option3;
    String option4;
    Answer answer;

    public Question(String question, String option1, String option2, String option3, String option4, Answer answer) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption4() {
        return option4;
    }

    public Answer getAnswer() {
        return answer;
    }
}

class Answer
{
    String answer;

    public Answer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }
}

interface IResult
{
    void showResult();
    double showPercentage(int correctAnswers,int totalQuestions);
    String showPerformance(double percentage);
}

class Result implements IResult
{
    int totalQuestions;
    int correctAnswers;
    int wrongAnswers;

    public Result(int totalQuestions, int correctAnswers, int wrongAnswers) {
        this.totalQuestions = totalQuestions;
        this.correctAnswers = correctAnswers;
        this.wrongAnswers = wrongAnswers;
    }

    @Override
    public void showResult() {
        System.out.println("Your results!");
        System.out.println("Total Questions " + totalQuestions);
        System.out.println("Number of correct answers " + correctAnswers);
        System.out.println("Number of wrong answers " + wrongAnswers);
        System.out.println("Percentage " + showPercentage(correctAnswers,totalQuestions));
        System.out.println("Your performance " + showPerformance(showPercentage(correctAnswers,totalQuestions)));

    }

    @Override
    public double showPercentage(int correctAnswers, int totalQuestions) {
        //System.out.println(correctAnswers + " " + totalQuestions);
        return (double) (correctAnswers / (double)totalQuestions) * 100 ;
    }

    @Override
    public String showPerformance(double percentage) {
        String performance = "";

        if(percentage > 60)
        {
            performance = "Good";
        }
        else if(percentage < 40)
        {
            performance = "Poor";
        }

        return performance;

    }
}

