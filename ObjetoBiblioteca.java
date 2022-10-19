
package aula;


public class ObjetoBiblioteca {
    
    String titulo;
    String autora;
    String editora;
    int pagina;
    int livro;
    
    void nome (String titulo){
        System.out.println("Titulo: "+titulo);        
    }
    void autora (String autora){
        System.out.println("Autor(a): "+autora);
    }
    void editora (String editora){
        System.out.println("Editora: "+editora);
    }
    void paginas (int paginas){
        System.out.println("Numero de paginas: "+paginas);
    }
    boolean emprestar (int livro){
       
        if (livro == 1){
            System.out.println("Você recebeu: "+livro+" livro");
            this.livro = livro;
            return true;
        }
        else if (livro >1){
            System.out.println("Você só pode pegar um livro");
            this.livro -= livro;
            return false;
        }
        else{
            System.out.println ("Você não quer um livro");
            this.livro -= livro;
            return false;
        }
        
    }
    boolean devolver (int livro1){
       livro1 = this.livro;
       
       if (livro1 ==  1){
           System.out.println ("Você devolveu "+livro1+" livro");
           livro1 -= livro1;
           return true;
       }
       else{
           System.out.println ("Você não quer(pode) devolver um livro");
           return false;
       }
}
}
