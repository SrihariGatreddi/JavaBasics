public class regionMatches {
    private final String Str1;
    private final String Str2;
    regionMatches(String Str1,String Str2)
    {
        this.Str1 = Str1;
        this.Str2 = Str2;
    }
    public boolean equals()
    {
        return Str1.equalsIgnoreCase(Str2);
    }
    public void checkStrings()
    {
        if(equals())
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
    public void regionMatch()
    {
        System.out.println(Str1.regionMatches(true,9,Str2,0,13));
    }
    public static void main(String[] args) {
        regionMatches r1 = new regionMatches("Hi iam a Java Developer","Java Developer");
        r1.checkStrings();
        r1.regionMatch();
    }
}