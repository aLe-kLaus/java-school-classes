package prova2_2;

class Regular {
 private String nome;
 private double salario;

 public Regular(String nomeRegular, double salarioRegular) {
  this.nome = nomeRegular;
  this.salario = salarioRegular;
 }
 public String getNome() {
  return this.nome;
 }
 public double getSalario() {
  salario = salario - (salario*0.15);
  return this.salario;
 }
}