package DTO;

/**
 *
 * @author silvi_5cnyxi8
 */
public class Especialidade {
    private int codigo;
    private String nome;
    private String descricao;
    private double valor;
   
    
   
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
     @Override
    public String toString() {
        return this.getNome();
    }
}
