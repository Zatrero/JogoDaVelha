package jododavelha2020;

public class Jogo_Logica {

    // modelo matematico xom mtriz
    // tamanh 3 x 3
    // conveções
    // 0 = botao CINZA
    // 1 = Botao com X
    // 2 - Botao com O
    private int[][] matriz = new int[3][3];
    // indices vao de ZERO a DOIS: 0, 1, 2
    private int Player = 1;
    private int Winner;
    private int countX;
    private int countO;

    public void Jogo_da_Velha() {
        System.out.println("CONSTRUTORJogdador da vez " + Player);
        limpar();
        reset();
    }

    public void limpar() {
        // coluna  
        matriz[0][0] = 0;
        matriz[1][0] = 0;
        matriz[2][0] = 0;
        // vcoluna 2
        matriz[0][1] = 0;
        matriz[1][1] = 0;
        matriz[2][1] = 0;
        // vcoluna 3
        matriz[0][2] = 0;
        matriz[1][2] = 0;
        matriz[2][2] = 0;

        Player = 1; // jogador X
        Winner = 0; // inicia com ZERO, niguem ganhou
    }

    //inicializa os contadores
    public void reset() {
        countX = 0; // resta o placar de X
        countO = 0; //reseta o placar de O
    }

    // metodos acessores e modificadores
    // set's / get's
    public int getPlayer() {
        return Player;
    }

    public void setPlayer(int Player) {
        this.Player = Player;
    }

    public int getWinner() {
        return Winner;
    }

    public void setWinner(int Winner) {
        this.Winner = Winner;
    }

    // coluna 1
    public int getJogo00() {
        return matriz[0][0];
    }

    public void setJogo00(int valor) {
        matriz[0][0] = valor;
    }

    public int getJogo10() {
        return matriz[1][0];
    }

    public void setJogo10(int valor) {
        matriz[1][0] = valor;
    }

    public int getJogo20() {
        return matriz[2][0];
    }

    public void setJogo20(int valor) {
        matriz[2][0] = valor;
    }

    // coluna 2
    public int getJogo01() {
        return matriz[0][1];
    }

    public void setJogo01(int valor) {
        matriz[0][1] = valor;
    }

    public int getJogo11() {
        return matriz[1][1];
    }

    public void setJogo11(int valor) {
        matriz[1][1] = valor;
    }

    public int getJogo21() {
        return matriz[2][1];
    }

    public void setJogo21(int valor) {
        matriz[2][1] = valor;
    }

    // coluna 3
    public int getJogo02() {
        return matriz[0][2];
    }

    public void setJogo02(int valor) {
        matriz[0][2] = valor;
    }

    public int getJogo12() {
        return matriz[1][2];
    }

    public void setJogo12(int valor) {
        matriz[1][2] = valor;
    }

    public int getJogo22() {
        return matriz[2][2];
    }

    public void setJogo22(int valor) {
        matriz[2][2] = valor;
    }

    //Gets sets do Placar
    public int getCountX() {
        return countX;
    }

    public void setCountX(int countX) {
        this.countX = countX;
    }

    public int getCountO() {
        return countO;
    }

    public void setCountO(int countO) {
        this.countO = countO;
    }

    //Placar
    public void placar() {
        if (Winner == 1) {
            countX++;
        } else {
            if (Winner == 2) {
                countO++;
            }
        }
    }

    public void Champion() {
        // verificação do jogador com valor 1/X
        if ((getJogo00() == 1) && (getJogo01() == 1) && (getJogo02() == 1)) {
            Winner = 1;
        } else {
            if ((getJogo10() == 1) && (getJogo11() == 1) && (getJogo12() == 1)) {
                Winner = 1;
            } else {
                if ((getJogo20() == 1) && (getJogo21() == 1) && (getJogo22() == 1)) {
                    Winner = 1;
                } else {

                    if ((getJogo00() == 1) && (getJogo10() == 1) && (getJogo20() == 1)) {
                        Winner = 1;
                    } else {
                        if ((getJogo10() == 1) && (getJogo11() == 1) && (getJogo12() == 1)) {
                            Winner = 1;
                        } else {
                            if ((getJogo01() == 1) && (getJogo11() == 1) && (getJogo21() == 1)) {
                                Winner = 1;
                            } else {
                                if ((getJogo02() == 1) && (getJogo12() == 1) && (getJogo22() == 1)) {
                                    Winner = 1;
                                } else {

                                    if ((getJogo00() == 1) && (getJogo11() == 1) && (getJogo22() == 1)) {
                                        Winner = 1;
                                    } else {
                                        if ((getJogo20() == 1) && (getJogo11() == 1) && (getJogo02() == 1)) {
                                            Winner = 1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        // verificação do jogador com valor 2/O
        if ((getJogo00() == 2) && (getJogo01() == 2) && (getJogo02() == 2)) {
            Winner = 2;
        } else {
            if ((getJogo10() == 2) && (getJogo11() == 2) && (getJogo12() == 2)) {
                Winner = 2;
            } else {
                if ((getJogo20() == 2) && (getJogo21() == 2) && (getJogo22() == 2)) {
                    Winner = 2;
                } else {

                    if ((getJogo00() == 2) && (getJogo10() == 2) && (getJogo20() == 2)) {
                        Winner = 2;
                    } else {
                        if ((getJogo10() == 2) && (getJogo11() == 2) && (getJogo12() == 2)) {
                            Winner = 2;
                        } else {
                            if ((getJogo02() == 2) && (getJogo12() == 2) && (getJogo22() == 2)) {
                                Winner = 2;
                            } else {

                                if ((getJogo00() == 2) && (getJogo11() == 2) && (getJogo22() == 2)) {
                                    Winner = 2;
                                } else {
                                    if ((getJogo20() == 2) && (getJogo11() == 2) && (getJogo02() == 2)) {
                                        Winner = 2;
                                    } else {
                                        if ((getJogo01() == 2) && (getJogo11() == 2) && (getJogo21() == 2)) {
                                            Winner = 2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    //Atribuição de valores na matriz
    //00
    public void MarcaX00() {
        matriz[0][0] = 1;
    }

    public void MarcaO00() {
        matriz[0][0] = 2;
    }

    //01
    public void MarcaX01() {
        matriz[0][1] = 1;
    }

    public void MarcaO01() {
        matriz[0][1] = 2;
    }

    //02
    public void MarcaX02() {
        matriz[0][2] = 1;
    }

    public void MarcaO02() {
        matriz[0][2] = 2;
    }

    //10
    public void MarcaX10() {
        matriz[1][0] = 1;
    }

    public void MarcaO10() {
        matriz[1][0] = 2;
    }

    //11
    public void MarcaX11() {
        matriz[1][1] = 1;
    }

    public void MarcaO11() {
        matriz[1][1] = 2;
    }

    //12
    public void MarcaX12() {
        matriz[1][2] = 1;
    }

    public void MarcaO12() {
        matriz[1][2] = 2;
    }

    //20
    public void MarcaX20() {
        matriz[2][0] = 1;
    }

    public void MarcaO20() {
        matriz[2][0] = 2;
    }

    //21
    public void MarcaX21() {
        matriz[2][1] = 1;
    }

    public void MarcaO21() {
        matriz[2][1] = 2;
    }

    //22
    public void MarcaX22() {
        matriz[2][2] = 1;
    }

    public void MarcaO22() {
        matriz[2][2] = 2;
    }

}
