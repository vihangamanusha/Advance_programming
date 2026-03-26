public class MyEasyRegistration {
    private MyDifficultRegistration dr=new MyDifficultRegistration();

    public MyEasyRegistration(String regno) {
        setRegNo(regno);
    }

    public void setRegNo(String regno) {
        if(regno.length()!=6){
            throw new IllegalArgumentException("The regno must be 6 characters");
        }
        dr.setFirstCharacter(regno.charAt(0));
        dr.setSecondCharacter(regno.charAt(1));
        dr.setThirdCharacter(regno.charAt(2));
        dr.setFourthCharacter(regno.charAt(3));
        dr.setFifthCharacter(regno.charAt(4));
        dr.setSixthCharacter(regno.charAt(5));
    }

    public String getregno(){
        return dr.getregno();
    }
}
