/* Este programa em C gerencia consultas m�dicas, permitindo o cadastro de m�dicos e datas de consulta, a pesquisa de m�dicos pelo nome ou
   pela data da consulta, al�m da listagem, altera��o e exclus�o desses dados. As informa��es s�o armazenadas em um arquivo de texto ("agenda.txt") e
   podem ser recuperadas para visualiza��o ou modifica��o. O menu interativo oferece op��es para executar essas funcionalidades, garantindo o
   gerenciamento eficiente das consultas. */

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

char medico[3][25];
char data_consulta[3][11];
FILE *agenda;

void entrada()
{
    for(int i = 0; i < 3;i++){
    printf("Digite o nome do m�dico %d: ",i + 1);
    gets(medico[i]); printf("\n");
    printf("Digite a data da consulta %d: ",i + 1);
    gets(data_consulta[i]); printf("\n");
        }
        agenda = fopen("agenda.txt","w");
        fwrite(medico, sizeof(medico), 1, agenda);
        fwrite(data_consulta, sizeof(data_consulta), 1, agenda);
        fclose(agenda);
}

void listadados()
{
        agenda = fopen("agenda.txt","r");
        fread(&medico, sizeof(medico), 1, agenda);
        fread(&data_consulta, sizeof(data_consulta), 1, agenda);
        fclose(agenda);

        for(int i = 0; i < 3;i++)
            {
                if(medico[i][0] != '*'){
            printf("M�dico %d: ",i + 1);
            puts(medico[i]); printf("\n");
            printf("Data da consulta %d: ",i + 1);
            puts(data_consulta[i]); printf("\n");
                }
            }
}

void pesquisarmedico()
{
    char pesquisa[25];
    int i;
    int j;
    int comp;

    agenda = fopen("agenda.txt","r");
    fread(&medico, sizeof(medico), 1, agenda);
    fread(&data_consulta, sizeof(data_consulta), 1, agenda);
    fclose(agenda);

    printf("Insira o nome do m�dico: ");
    gets(pesquisa);

    for(j=0;j<3;j++){
    for(i=0;medico[j][i]!='\0';i++)
        {
            if (medico[j][i]!=pesquisa[i]){
                comp = 1;
                break;
            }
        }
        if (medico[j][i]=='\0'&&pesquisa[i]=='\0')
            {
            comp = 0;
            printf("\nM�dico: ");
            puts(medico[j]);
            printf("Data da consulta: ");
            puts(data_consulta[j]); printf("\n");
            break;
        }
    }
    if (comp == 1)
    {

    printf("\nNome n�o encontrado.\n\n");
    }
}

void pesquisardata()
{
    char pesquisa[25];
    int i;
    int j;
    int comp=0;

    agenda = fopen("agenda.txt","rb");
    fread(&medico, sizeof(medico), 1, agenda);
    fread(&data_consulta, sizeof(data_consulta), 1, agenda);
    fclose(agenda);

    printf("Insira a data da consulta (formato: dia/m�s/ano):");
    gets(pesquisa);

    for(j=0;j<3;j++){
    for(i=0;data_consulta[j][i]!='\0';i++)
        {
            if (data_consulta[j][i]!=pesquisa[i]){
                comp++;
                break;
            }
        }
        if (data_consulta[j][i]=='\0'&&pesquisa[i]=='\0')
            {
            comp = 0;
            printf("\nData da consulta: ");
            puts(data_consulta[j]);
            printf("M�dico: ");
            puts(medico[j]); printf("\n");
        }
    }
    if (comp == 3)
    {
    printf("\nData n�o encontrada.\n\n");
    }
}

void alteradados()
{
char pesquisa[25];
    int i;
    int j;
    int comp;

    agenda = fopen("agenda.txt","rb");
    fread(&medico, sizeof(medico), 1, agenda);
    fread(&data_consulta, sizeof(data_consulta), 1, agenda);
    fclose(agenda);

    printf("Insira o nome do m�dico: ");
    gets(pesquisa);

    for(j=0;j<3;j++){
    for(i=0;medico[j][i]!='\0';i++)
        {
            if (medico[j][i]!=pesquisa[i]){
                comp = 0;
                break;
            }
        }
        if (medico[j][i]=='\0'&&pesquisa[i]=='\0')
            {
        comp = 1;
        break;
        }
    }
    if (comp == 1)
    {
            printf("\nDigite o novo m�dico:");
            gets(medico[j]); printf("\n");

            printf("Digite a nova data:");
            gets(data_consulta[j]); printf("\n");

            agenda = fopen("agenda.txt","w");
            fwrite(medico, sizeof(medico), 1, agenda);
            fwrite(data_consulta, sizeof(data_consulta), 1, agenda);
            fclose(agenda);
    }else
    {
    printf("\nNome n�o encontrado.\n\n");
    }
}

void excluidados(){
char pesquisa[25];
    int i;
    int j;
    int comp;

    agenda = fopen("agenda.txt","rb");
    fread(&medico, sizeof(medico), 1, agenda);
    fread(&data_consulta, sizeof(data_consulta), 1, agenda);
    fclose(agenda);

    printf("Insira o nome do m�dico: ");
    gets(pesquisa);

    for(j=0;j<3;j++){
    for(i=0;medico[j][i]!='\0';i++)
        {
            if (medico[j][i]!=pesquisa[i]){
                comp = 0;
                break;
            }
        }
        if (medico[j][i]=='\0'&&pesquisa[i]=='\0')
            {
        comp = 1;
        break;
        }
    }
    if (comp == 1)
    {
            medico[j][0] = '*';

            agenda = fopen("agenda.txt","w");
            fwrite(medico, sizeof(medico), 1, agenda);
            fwrite(data_consulta, sizeof(data_consulta), 1, agenda);
            fclose(agenda);
    }else
    {
    printf("\nNome n�o encontrado.\n\n");
    }
}

void saida(){
printf("Programa encerrado!\n");
}

main(){
    setlocale(LC_ALL,"portuguese");
    int opcao;
do{

    printf("1 - Entrada de dados.\n");
    printf("2 � Lista todos os dados na tela.\n");
    printf("3 � Pesquisa um m�dico pelo nome completo e mostra todo os dados na tela.\n");
    printf("4 � Pesquisa pela data de consulta e mostra todos na tela.\n");
    printf("5 � Altera dados. Pesquisa pelo nome completo do m�dico.\n");
    printf("6 � Exclui dados. Pesquisa pelo nome completo do m�dico.\n");
    printf("7 - Sa�da.\n");

    scanf("%d", &opcao);

    getchar();

  switch (opcao)
  {
    case 1 :
    system("cls");
    entrada();
    break;

    case 2 :
    system("cls");
    listadados();
    break;

    case 3 :
    system("cls");
    pesquisarmedico();
    break;

    case 4 :
    system("cls");
    pesquisardata();
    break;

    case 5 :
    system("cls");
    alteradados();
    break;

    case 6 :
    system("cls");
    excluidados();
    break;

    case 7 :
    system("cls");
    saida();
    return 0;
    break;

    default :
    printf ("Valor invalido!\n");
  }
}
    while(opcao>=1 && opcao<=7);
}
