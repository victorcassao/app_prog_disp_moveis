package com.example.noticiando;
// URL que gera esses dados
// https://newsapi.org/v2/top-headlines?country=br&category=business&apiKey=615f261b85c141829c6fe0b949406cf1
public class APINewsHelper {
    private String json_string = "{\n" +
            "    \"articles\": [\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Jornalcontabil.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Ricardo Junior\",\n" +
            "            \"title\": \"Revisão do FGTS pode pagar entre R$ 14 mil a R$ 66 mil aos trabalhadores - Jornal Contábil\",\n" +
            "            \"description\": \"Os trabalhadores que estão em busca de um rendimento extra podem contar com a revisão do Fundo de Garantia do Tempo de Serviço (FGTS)\",\n" +
            "            \"url\": \"https://www.jornalcontabil.com.br/revisao-do-fgts-pode-pagar-entre-r-14-mil-a-r-66-mil-aos-trabalhadores/\",\n" +
            "            \"urlToImage\": \"https://www.jornalcontabil.com.br/wp-content/uploads/2017/01/FGTS1.jpg\",\n" +
            "            \"publishedAt\": \"2021-09-06T14:11:57Z\",\n" +
            "            \"content\": \"Os trabalhadores que estão em busca de um rendimento extra podem contar com a revisão do Fundo de Garantia do Tempo de Serviço (FGTS) que pode render mais de R$ 300 bilhões no acumulado a todos os tr… [+1815 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"info-money\",\n" +
            "                \"name\": \"InfoMoney\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Ibovespa opera entre perdas e ganhos com tensão com protestos em dia de feriado nos EUA - InfoMoney\",\n" +
            "            \"description\": \"Índice tem nova sessão negativa em dia de volume reduzido por conta do feriado nos EUA e maior cautela antes do 7 de setembro\",\n" +
            "            \"url\": \"https://www.infomoney.com.br/mercados/ibovespa-descola-de-exterior-e-cai-puxado-por-vale-e-tensao-com-protestos-dolar-sobe/\",\n" +
            "            \"urlToImage\": \"https://www.infomoney.com.br/wp-content/uploads/2020/08/Top-10-açoes-XP.jpg?quality=70\",\n" +
            "            \"publishedAt\": \"2021-09-06T13:13:54Z\",\n" +
            "            \"content\": \"SÃO PAULO – O Ibovespa opera entre perdas e ganhos nesta segunda-feira (6), descolando do dia mais positivo das bolsas internacionais em uma sessão que promete volume mais baixo diante do fechamento … [+16094 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Istoe.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Angélica Vilela\",\n" +
            "            \"title\": \"“Hoje, é possível investir muito cedo, com apenas R$ 20 por mês”, diz Charles Mendlowicz, economista - ISTOÉ\",\n" +
            "            \"description\": \"Charles Mendlowicz, economista com MBA em Gestão Estratégica de Negócios e em Logística Empresarial, e com mais de 20 anos de experiência no mercado financeiro é o convidado do novo episódio do MoneyPlay Podcast, programa voltado para o mundo das finanças, ap…\",\n" +
            "            \"url\": \"https://istoe.com.br/hoje-e-possivel-investir-muito-cedo-com-apenas-r-20-por-mes-diz-charles-mendlowicz-economista/\",\n" +
            "            \"urlToImage\": \"https://istoe.com.br/wp-content/uploads/sites/14/2021/09/foto-isote-1200x720.jpg\",\n" +
            "            \"publishedAt\": \"2021-09-06T13:10:00Z\",\n" +
            "            \"content\": \"Charles Mendlowicz, economista com MBA em Gestão Estratégica de Negócios e em Logística Empresarial, e com mais de 20 anos de experiência no mercado financeiro é o convidado do novo episódio do Money… [+5464 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"globo\",\n" +
            "                \"name\": \"Globo\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Teresina é a capital com a gasolina mais cara do país, diz levantamento da ANP - G1\",\n" +
            "            \"description\": \"Preço médio praticado na capital é de R$ 6,49, segundo levantamento feito entre os dias 29 de agosto e 4 de setembro.\",\n" +
            "            \"url\": \"https://g1.globo.com/pi/piaui/noticia/2021/09/06/teresina-tem-a-gasolina-mais-cara-do-pais-diz-levantamento-da-anp.ghtml\",\n" +
            "            \"urlToImage\": \"https://s2.glbimg.com/mUw-z9_y-m8hl30Ps3H6cU3wcng=/1200x/smart/filters:cover():strip_icc()/i.s3.glbimg.com/v1/AUTH_59edd422c0c84a879bd37670ae4f538a/internal_photos/bs/2021/w/3/cjCxHpRvehmPxpvkNNaA/captura-de-tela-2021-08-31-as-13.04.53.jpg\",\n" +
            "            \"publishedAt\": \"2021-09-06T12:34:50Z\",\n" +
            "            \"content\": \"A capital do Piauí cobra, em média, o valor mais alto por litro de gasolina comum no Brasil, R$ 6,49. O dado é do Sistema de Levantamento de Preços da Agência Nacional do Petróleo (ANP), que pesquiso… [+1765 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Oantagonista.com\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Crise hídrica \\\"não vai se resolver em dezembro, muito menos em abril\\\", diz ministro - O Antagonista\",\n" +
            "            \"description\": \"Segundo Bento Albuquerque, o presidente Jair Bolsonaro foi informado sobre a gravidade de situação em outubro do ano passado\",\n" +
            "            \"url\": \"https://www.oantagonista.com/brasil/crise-hidrica-nao-vai-se-resolver-em-dezembro-muito-menos-em-abril-diz-ministro/\",\n" +
            "            \"urlToImage\": \"https://cdn.oantagonista.com/uploads/2021/05/bento-albuquerque_27.mar_.2019-e1622541552609.jpg\",\n" +
            "            \"publishedAt\": \"2021-09-06T12:33:12Z\",\n" +
            "            \"content\": \"O ministro de Minas e Energia, Bento Albuquerque, disse nesta segunda-feira (6) que a crise hídrica não vai se resolver tão cedo.\\r\\nEm entrevista a O Globo, Albuquerque afirmou que o problema vai se e… [+774 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Investing.com\"\n" +
            "            },\n" +
            "            \"author\": \"Investing.com\",\n" +
            "            \"title\": \"Abertura de mercado: o que esperar para bolsa e câmbio no Brasil nesta 2ª-feira Por Investing.com - Investing.com Brasil\",\n" +
            "            \"description\": \"Abertura de mercado: o que esperar para bolsa e câmbio no Brasil nesta 2ª-feira\",\n" +
            "            \"url\": \"https://br.investing.com/news/stock-market-news/abertura-de-mercado-o-que-esperar-para-bolsa-e-cambio-no-brasil-nesta-2afeira-913716\",\n" +
            "            \"urlToImage\": \"https://i-invdn-com.investing.com/news/LYNXNPEB7N0OD_L.jpg\",\n" +
            "            \"publishedAt\": \"2021-09-06T12:18:00Z\",\n" +
            "            \"content\": \"Por Ana Beatriz Bartolo\\r\\nInvesting.com - Depois de o Ibovespa fechar a sexta-feira passada com alta 0,22%, aos 116.933 pontos, o Ibovespa Futuros operava estável às 09h13. O dólar também seguia na es… [+7301 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"info-money\",\n" +
            "                \"name\": \"InfoMoney\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Focus: mercado financeiro prevê inflação maior, juros mais altos e PIB menor para 2021 e 2022 - InfoMoney\",\n" +
            "            \"description\": \"No câmbio, economistas esperam dólar negociado a R$ 5,17 em dezembro, acima dos R$ 5,15 esperados no último Focus\",\n" +
            "            \"url\": \"https://www.infomoney.com.br/onde-investir/focus-mercado-financeiro-preve-inflacao-maior-juros-mais-altos-e-pib-menor-para-2021-e-2022/\",\n" +
            "            \"urlToImage\": \"https://www.infomoney.com.br/wp-content/uploads/2020/05/GettyImages-1189464449-1.jpg?quality=70\",\n" +
            "            \"publishedAt\": \"2021-09-06T11:51:33Z\",\n" +
            "            \"content\": \"(Rmcarvalho/Getty Images) \\r\\nSÃO PAULO O mercado financeiro voltou a elevar suas projeções para a inflação para 2021 e 2022. Os dados constam no relatório Focus, publicado pelo Banco Central. Os dados… [+1876 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"info-money\",\n" +
            "                \"name\": \"InfoMoney\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"CSN tem rating elevado pela Moody’s e Méliuz aprova desdobramento; notícias de frigoríficos, CCR e mais - InfoMoney\",\n" +
            "            \"description\": \"Confira os destaques do noticiário corporativo na sessão desta segunda-feira (6)\",\n" +
            "            \"url\": \"https://www.infomoney.com.br/mercados/csn-tem-rating-elevado-pela-moodys-e-meliuz-aprova-desdobramento-noticias-de-frigorificos-ccr-e-mais/\",\n" +
            "            \"urlToImage\": \"https://www.infomoney.com.br/wp-content/uploads/2019/06/siderurgica-aco-csn.jpg?quality=70\",\n" +
            "            \"publishedAt\": \"2021-09-06T11:32:07Z\",\n" +
            "            \"content\": \"SÃO PAULO – Em véspera de feriado no Brasil e com as bolsas nos Estados Unidos fechadas, o noticiário corporativo fica menos movimentado nesta segunda-feira (6), com destaque para a notícia da suspen… [+10095 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Moneytimes.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Márcio Juliboni\",\n" +
            "            \"title\": \"3 ações para ter chances de ganhar até 2,90% nesta emenda de feriado de 7 de setembro - Money Times\",\n" +
            "            \"description\": \"Destaque: Suzano é o papel com maior potencial de alta hoje, entre os indicados pelo BTG (Imagem: Reprodução/Suzano) Com a B3 (B3SA3) operando normalmente nesta segunda-feira (6), véspera do Dia da Independência, é possível arriscar uma tacada para ganhar até…\",\n" +
            "            \"url\": \"https://www.moneytimes.com.br/3-acoes-para-ter-chances-de-ganhar-ate-290-nesta-emenda-de-feriado-de-7-de-setembro/\",\n" +
            "            \"urlToImage\": \"https://media.moneytimes.com.br/uploads/2020/11/dardo.jpg\",\n" +
            "            \"publishedAt\": \"2021-09-06T11:32:03Z\",\n" +
            "            \"content\": \"Destaque: Suzano é o papel com maior potencial de alta hoje, entre os indicados pelo BTG (Imagem: Reprodução/Suzano)\\r\\nCom a B3 (B3SA3) operando normalmente nesta segunda-feira (6), véspera do Dia da … [+1884 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Gmconline.com.br\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Jovem encontra Lamborghini esquecido na casa dos avós - GMC Online\",\n" +
            "            \"description\": \"Geralmente, as casas de avós são recheadas de antiguidades. Mas não é comum achar uma Lamborghini. Foi o que aconteceu com um jovem ao visitar sua avó.\",\n" +
            "            \"url\": \"https://gmconline.com.br/noticias/geral/jovem-encontra-lamborghini-esquecido-na-casa-dos-avos/\",\n" +
            "            \"urlToImage\": \"https://gmconline.com.br/wp-content/uploads/2021/09/Jovem-norte-americano-acabou-se-surpreendendo-quan-00547693-0-202109052136.jpeg\",\n" +
            "            \"publishedAt\": \"2021-09-06T11:27:00Z\",\n" +
            "            \"content\": \"Foto: Divulgação\\r\\nGeralmente, as casas de avós são recheadas de antiguidades. Mas não é comum achar uma Lamborghini. Foi o que aconteceu com um jovem norte-americano ao visitar sua avó. Ele decidiu o… [+1742 chars]\"\n" +
            "        }\n" +
            "    ]\n" +
            "}";

    public String getJson_string() {
        return this.json_string;
    }
}

