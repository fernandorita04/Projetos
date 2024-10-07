/* Este código em C gerencia consultas médicas, permitindo inserir, listar, pesquisar, alterar e excluir registros contendo
   nome do médico, data da consulta e celular. As informações são armazenadas e manipuladas em um arquivo, e o sistema é controlado por um menu de opções. */

#include <stdio.h>
#include <locale.h>

struct dados {
    char medico[25];
    char data_consulta[11];
    char celular[12];
};

void entrada(struct dados *pontestr) {
    FILE *arquivo;
    arquivo = fopen("arquivo", "a");

    printf("\nInsira o nome do médico: ");
    gets(pontestr->medico);

    printf("\nInsira a data da consulta: ");
    gets(pontestr->data_consulta);

    printf("\nInsira o número de celular: ");
    gets(pontestr->celular);

    fwrite(pontestr, sizeof(*pontestr), 1, arquivo);
    fclose(arquivo);
}

void listar(struct dados *pontestr) {
    FILE *arquivo;
    arquivo = fopen("arquivo", "r");
    int x;

    for (;;) {
        x = fread(pontestr, sizeof(*pontestr), 1, arquivo);

        if (x == 0) {
            break;
        }

        if (pontestr->medico[0] != '*') {
            printf("\nNome do médico: %s", pontestr->medico);
            printf("\nData da consulta: %s", pontestr->data_consulta);
            printf("\nNúmero de celular: %s\n\n", pontestr->celular);
        }
    }
    system("pause");
    fclose(arquivo);
}

void pesquisanome(struct dados *pontestr) {
    FILE *arquivo;
    arquivo = fopen("arquivo", "r");
    int x, comp, i = 0;
    char pesquisa[25];

    printf("\nInsira o nome do médico: ");
    gets(pesquisa);
    system("cls");

    for (;;) {
        x = fread(pontestr, sizeof(*pontestr), 1, arquivo);
        if (x == 0) break;

        while (pesquisa[i] != '\0' || pontestr->medico[i] != '\0') {
            if (pesquisa[i] != pontestr->medico[i]) {
                comp = 0;
                break;
            }
            i++;
        }
        if (pesquisa[i] == '\0' && pontestr->medico[i] == '\0') {
            comp = 1;
            printf("\nRegistro localizado!\n");
            printf("\nNome do médico: %s", pontestr->medico);
            printf("\nData da consulta: %s", pontestr->data_consulta);
            printf("\nCelular: %s\n", pontestr->celular);
            system("pause");
            break;
        }
    }
    if (comp == 0) {
        printf("\nRegistro não localizado.\n");
        system("pause");
    }
    fclose(arquivo);
}

void pesquisacel(struct dados *pontestr) {
    FILE *arquivo;
    arquivo = fopen("arquivo", "r");
    char pesquisa[25];
    int x, comp, i = 0;

    printf("\nInsira o nome do médico: ");
    gets(pesquisa);
    system("cls");

    for (;;) {
        x = fread(pontestr, sizeof(*pontestr), 1, arquivo);
        if (x == 0) break;

        while (pesquisa[i] != '\0' || pontestr->medico[i] != '\0') {
            if (pesquisa[i] != pontestr->medico[i]) {
                comp = 0;
                break;
            }
            i++;
        }
        if (pesquisa[i] == '\0' && pontestr->medico[i] == '\0') {
            comp = 1;
            printf("\nRegistro localizado!\n");
            printf("\nNome do médico: %s", pontestr->medico);
            printf("\nCelular: %s\n", pontestr->celular);
            system("pause");
            break;
        }
    }
    if (comp == 0) {
        printf("\nRegistro não localizado.\n");
        system("pause");
    }
    fclose(arquivo);
}

void pesquisadata(struct dados *pontestr) {
    FILE *arquivo;
    arquivo = fopen("arquivo", "r");
    char pesquisa[25];
    int x, comp, i = 0;

    printf("\nInsira a data da consulta: ");
    gets(pesquisa);
    system("cls");

    for (;;) {
        x = fread(pontestr, sizeof(*pontestr), 1, arquivo);
        if (x == 0) break;

        while (pesquisa[i] != '\0' || pontestr->data_consulta[i] != '\0') {
            if (pesquisa[i] != pontestr->data_consulta[i]) {
                comp = 0;
                break;
            }
            i++;
        }
        if (pesquisa[i] == '\0' && pontestr->data_consulta[i] == '\0') {
            if (pontestr->medico[0] != '*') {
                comp = 1;
                printf("\nRegistro localizado!\n");
                printf("\nData da consulta: %s", pontestr->data_consulta);
                printf("\nNome do médico: %s\n", pontestr->medico);
                system("pause");
                break;
            }
        }
    }
    if (comp == 0) {
        printf("\nRegistro não localizado.\n");
        system("pause");
    }
    fclose(arquivo);
}

void alteradados(struct dados *pontestr) {
    FILE *arquivo;
    arquivo = fopen("arquivo", "r+");
    char pesquisa[25];
    int i = 0, comp, x;

    printf("\nInsira o nome do médico a ser alterado: ");
    gets(pesquisa);
    system("cls");

    for (;;) {
        x = fread(pontestr, sizeof(*pontestr), 1, arquivo);
        if (x == 0) break;

        while (pesquisa[i] != '\0' || pontestr->medico[i] != '\0') {
            if (pesquisa[i] != pontestr->medico[i]) {
                comp = 0;
                break;
            }
            i++;
        }
        if (pesquisa[i] == '\0' && pontestr->medico[i] == '\0') {
            comp = 1;
        }
        if (comp == 1) {
            printf("\nRegistro localizado!\n");
            printf("\nDigite o novo médico: ");
            gets(pontestr->medico);
            printf("\nDigite a nova data de consulta: ");
            gets(pontestr->data_consulta);
            printf("\nDigite o novo número de celular: ");
            gets(pontestr->celular);

            fseek(arquivo, -sizeof(*pontestr), SEEK_CUR);
            fwrite(pontestr, sizeof(*pontestr), 1, arquivo);

            system("pause");
            system("cls");
            break;
        }
    }
    if (comp == 0) {
        printf("\nRegistro não localizado.\n");
        system("pause");
    }
    fclose(arquivo);
}

void excluidados(struct dados *pontestr) {
    FILE *arquivo;
    arquivo = fopen("arquivo", "r+");
    char pesquisa[25];
    int x, i = 0, comp;

    printf("\nInsira o nome do médico a ser excluído: ");
    gets(pesquisa);
    system("cls");

    for (;;) {
        x = fread(pontestr, sizeof(*pontestr), 1, arquivo);
        if (x == 0) break;

        while (pesquisa[i] != '\0' || pontestr->medico[i] != '\0') {
            if (pesquisa[i] != pontestr->medico[i]) {
                comp = 0;
                break;
            }
            i++;
        }
        if (pesquisa[i] == '\0' && pontestr->medico[i] == '\0') {
            comp = 1;
        }
        if (comp == 1) {
            printf("\nRegistro excluído!\n");
            pontestr->medico[0] = '*';
            fseek(arquivo, -sizeof(*pontestr), SEEK_CUR);
            fwrite(pontestr, sizeof(*pontestr), 1, arquivo);

            system("pause");
            system("cls");
            break;
        }
    }
    if (comp == 0) {
        printf("\nRegistro não localizado.\n");
        system("pause");
    }
    fclose(arquivo);
}

void sair(FILE *arquivo) {
    fclose(arquivo);
    exit(0);
}

int main() {
    setlocale(LC_ALL, "");

    FILE *arquivo;
    struct dados estrutura;
    struct dados *pontestr = &estrutura;
    int opcao = 1;

    while (opcao > 0 && opcao <= 8) {
        printf("-----------------MENU-------------------");
        printf("\n1-Entrada de dados.");
        printf("\n2-Listar dados cadastrados.");
        printf("\n3-Pesquisar uma consulta pelo nome completo do médico.");
        printf("\n4-Pesquisar um celular pelo nome completo do médico.");
        printf("\n5-Pesquisar um médico pela data da consulta.");
        printf("\n6-Alterar dados.");
        printf("\n7-Excluir dados.");
        printf("\n8-Sair.");
        printf("\n----------------------------------------");
        printf("\n\nInsira a opção desejada: ");
        scanf("%d", &opcao);

        system("cls");
        fflush(stdin);

        switch (opcao) {
            case 1:
                entrada(pontestr);
                system("cls");
                break;

            case 2:
                listar(pontestr);
                system("cls");
                break;

            case 3:
                pesquisanome(pontestr);
                system("cls");
                break;

            case 4:
                pesquisacel(pontestr);
                system("cls");
                break;

            case 5:
                pesquisadata(pontestr);
                system("cls");
                break;

            case 6:
                alteradados(pontestr);
                system("cls");
                break;

            case 7:
                excluidados(pontestr);
                system("cls");
                break;

            case 8:
                printf("\nFim do programa!\n");
                exit(0);

            default:
                printf("\nOpção inválida.\n");
                break;
        }
    }

    return 0;
}
