package week1;

public class Student {
        private int ID;
        private String firstName;
        private String lastName;
        private int score;

        public Student(int id, String firstname, String lastname)
        {
            this.ID = id;
            this.firstName = firstname;
            this.lastName = lastname;
        }
        public int getID()
        {
            return ID;
        }
        public String getFirstName()
        {
            return firstName;
        }
        public String getLastName()
        {
            return lastName;
        }

    public void setScore(int s) {
        this.score = s;
    }

    public int getScore()
        {
            return score;
        }


}
