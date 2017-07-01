/**
 *@author Cícero Higor Gomes de Sousa
 *Matricula: 2150190
 *Data: 17/11/2016
 *Descrição:Turma*/

import java.util.ArrayList;
import java.util.Iterator;

public class Turma {
    String nome;
    String professor;
    int numAlunos;
    boolean acessivel;
    ArrayList<Integer> horarios = new ArrayList<Integer>();
    String[][] horario = {
        {"segunda", "terça", "quarta", "quinta", "sexta"},
        {"8hs",    "10hs",    "12hs",   "14hs",   "16hs", "18hs","20hs"}};
    
    Turma(){
    }
    
    Turma(String nome, String professor, int numAlunos, boolean acessivel){
        this.nome = nome;
        this.professor = professor;
        this.numAlunos = numAlunos;
        this.acessivel = acessivel;
    }
    
    void addHorario(int horario){
        horarios.add(horario);
        
    }
    
    String getHorariosString(){
        Iterator<Integer> aux = horarios.iterator();
        String palavra = "";
        while (aux.hasNext()){
            int i = aux.next().intValue();
            int j = (i%7)-1;
            if(j<0) j=6;
            palavra += horario[0][(i-1)/7]+ " " + horario[1][j];
            if(aux.hasNext()){
                palavra += ", ";
            } 
        }
    return palavra;   
    }
    String getDescricao(){
        String aux;
        if (acessivel == true)
            aux = "sim";
        else
            aux = "não";
 
        return "Turma: " + nome + "\nProfessor: " + professor + "\nNúmero de Alunos: " + numAlunos + "\nHorário: " + getHorariosString() + "\nAcessível: " + aux;
    }
}

