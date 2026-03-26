public class MyDifficultRegistration {
    private char regno[]=new char[6];

    public void setFirstCharacter(char ch){
        regno[0]=ch;
    }
    public void setSecondCharacter(char ch){
        regno[1]=ch;
    }
    public void setThirdCharacter(char ch){
        regno[2]=ch;
    }
    public void setFourthCharacter(char ch){
        regno[3]=ch;
    }
    public void setFifthCharacter(char ch){
        regno[4]=ch;
    }
    public void setSixthCharacter(char ch){
        regno[5]=ch;
    }

    public String getregno(){
        return new String(regno);
    }


}
