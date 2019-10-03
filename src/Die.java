  public class Die
    {
        private final int MAX = 6; // maksimale face value
        private int faceValue; // Integer der skal repræsentere faceValuen

        public Die()
        {
            faceValue = 1;
        }

        public int roll()
        {
            faceValue = (int)(Math.random() * MAX) + 1;
            return faceValue;
        }

        public int getFaceValue()
        {
            return faceValue;
        }

        public String toString()
        {
            String result = Integer.toString(faceValue);
            return result;
        }
    }




