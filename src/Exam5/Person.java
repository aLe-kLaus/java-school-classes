package Exam5;

public class Person {
    private String name;
    private String cpf;
    private String email;

    public void setName(String name){
        this.name = name;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String toString() {
        return "Nome: " + name + '\n' +
                "CPF: " + cpf + '\n' +
                "Email: " + email + '\n';
    }

}
