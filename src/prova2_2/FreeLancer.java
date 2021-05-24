package prova2_2;

class FreeLancer {
 private String nome;
 private double salario;
 private double horas;
 private double valor;

 public FreeLancer(String nomeFreeLancer, double horasFreeLancer, double valorFreeLancer) {
  this.nome = nomeFreeLancer;
  this.horas = horasFreeLancer;
  this.valor = valorFreeLancer;

 }
 public String getNome() {
  return this.nome;
 }
 public double getSalario() {
  salario = horas * valor;
  salario = salario - (salario*0.25);
  return this.salario;
 }
}