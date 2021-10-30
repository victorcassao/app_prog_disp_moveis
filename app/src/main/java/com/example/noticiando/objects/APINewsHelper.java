package com.example.noticiando.objects;
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
            "            \"author\": \"Ricardo Junior - O Brabo\",\n" +
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

    private static String categoria_entretenimento = "{\n" +
            "    \"status\": \"ok\",\n" +
            "    \"totalResults\": 70,\n" +
            "    \"articles\": [\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Uol.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"UOL\",\n" +
            "            \"title\": \"Gui vence Prova do Lampião e trocará roceiro vetado da prova do fazendeiro - UOL\",\n" +
            "            \"description\": \"Gui Araujo levou a melhor na Prova do Lampião da semana que disputou com Day, Sthe e Marina em \\\"A Fazenda\\\" (RecordTV).O influenciador poderá escolher entre dois poderes, o da chama amarela, ainda não revelado, e o da chama vermelha, que pede que o dono de\",\n" +
            "            \"url\": \"https://tvefamosos.uol.com.br/noticias/redacao/2021/10/24/gui-vence-prova-do-lampiao-e-trocara-roceiro-vetado-da-prova-do-fazendeiro.htm\",\n" +
            "            \"urlToImage\": \"https://conteudo.imguol.com.br/c/entretenimento/d0/2021/10/24/a-fazenda-2021-gui-araujo-vence-prova-do-lampiao-1635105218303_v2_615x300.png\",\n" +
            "            \"publishedAt\": \"2021-10-24T19:54:00Z\",\n" +
            "            \"content\": \"Gui Araujo levou a melhor na Prova do Lampião da semana que disputou com Day, Sthe e Marina em \\\"A Fazenda\\\" (RecordTV).\\r\\nO influenciador poderá escolher entre dois poderes, o da chama amarela, ainda n… [+719 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Uol.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Fabio Augusto\",\n" +
            "            \"title\": \"Cristina desmascara Marcão e choca Elivaldo: “Tá bancando o espião do Maurílio” - Observatório da TV\",\n" +
            "            \"description\": \"Nos próximos capítulos de Império, Marcão é preso e Cristina revela a Elivaldo que seu amigo do camelódromo é o informante de Maurílio\",\n" +
            "            \"url\": \"https://observatoriodatv.uol.com.br/novelas/capitulos/cristina-desmascara-marcao-e-choca-elivaldo-ta-bancando-o-espiao-do-maurilio\",\n" +
            "            \"urlToImage\": \"https://observatoriodatv.uol.com.br/wp-content/uploads/2021/10/Design-sem-nome-92-1.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T19:30:00Z\",\n" +
            "            \"content\": \"Nos próximos capítulos de Império, finalmente Maurílio (Carmo Dalla Vecchia) vai parar na cadeia. O vilão cai em uma armadilha de José Alfredo (Alexandre Nero) e acaba detido, para a alegria do homem… [+1423 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Uol.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Colaboração para o UOL, em São Paulo\",\n" +
            "            \"title\": \"Quem são João Guilherme, Jade Picon e Gui Araujo e por que bombaram? - UOL\",\n" +
            "            \"description\": \"O final de semana para o público de A Fazenda 13 girou em torno de uma fofoca: a suposta traição envolvendo Jade Picon, João Guilherme e Gui Araujo.Esses três nomes ficaram entre os mais comentados no Twitter pois, na última festa do reality rural, Gui Ar\",\n" +
            "            \"url\": \"https://tvefamosos.uol.com.br/noticias/redacao/2021/10/24/quem-sao-jade-picon-joao-guilherme-e-gui-araujo-e-por-que-bombaram.htm\",\n" +
            "            \"urlToImage\": \"https://conteudo.imguol.com.br/c/entretenimento/b8/2021/10/23/a-fazenda-2021-joao-guilherme-afirma-que-nao-incitara-hate-para-a-ex-jade-picon-apos-suposta-traicao-1635031861272_v2_615x300.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T19:27:00Z\",\n" +
            "            \"content\": \"O final de semana para o público de A Fazenda 13 girou em torno de uma fofoca: a suposta traição envolvendo Jade Picon, João Guilherme e Gui Araujo.\\r\\nEsses três nomes ficaram entre os mais comentados… [+5115 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Canaltech.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Durval Ramos\",\n" +
            "            \"title\": \"As 10 séries mais assistidas da semana (24/10/2021) - Canaltech\",\n" +
            "            \"description\": \"Estreia da nova temporada de Você é um dos destaques da semana, que teve ainda a série Pânico e a animação Young Justice conquistando os brasileiros\",\n" +
            "            \"url\": \"https://canaltech.com.br/entretenimento/series-mais-assistidas-da-semana-24102021/\",\n" +
            "            \"urlToImage\": \"https://t.ctcdn.com.br/rqR52HH-XthjRbJcGnzBncRehlo=/1280x720/smart/i520401.png\",\n" +
            "            \"publishedAt\": \"2021-10-24T19:00:00Z\",\n" +
            "            \"content\": \"Outubro caminha para a sua reta final e a gente já começa a perceber uma mudança naquilo que o brasileiro vem maratonando. Tanto que temos algumas novidades aparecendo na lista de séries mais assisti… [+9689 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Uol.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Thais Lombardi\",\n" +
            "            \"title\": \"Tati Quebra-Barraco revela vida amorosa de Rico em A Fazenda 13: “Ninguém vai, tem que pagar” - Observatório da TV\",\n" +
            "            \"description\": \"Em meio à confusão generalizada por causa da Prova da Chama Vermelha em A Fazenda 13, Rico e Tati Quebra-Barraco discutiram sobre a vida sexual do peão.\",\n" +
            "            \"url\": \"https://observatoriodatv.uol.com.br/noticias/tati-quebra-barraco-revela-vida-amorosa-de-rico-em-a-fazenda-13-ninguem-vai-tem-que-pagar\",\n" +
            "            \"urlToImage\": \"https://observatoriodatv.uol.com.br/wp-content/uploads/2021/10/Tati-Quebra-Barraco-em-A-Fazenda-13_2410.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T18:26:00Z\",\n" +
            "            \"content\": \"Em meio à confusão generalizada por causa da Prova da Chama Vermelha em A Fazenda 13, Rico Melquiades e Tati Quebra-Barracocomeçaram a trocar ofensas após o comediante a chamar de preguiçosa e insinu… [+1275 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"R7.com\"\n" +
            "            },\n" +
            "            \"author\": \"R7.com\",\n" +
            "            \"title\": \"Rico discute com Aline após sorteio para a Prova de Fogo - A Fazenda 13 - R7.COM\",\n" +
            "            \"description\": \"Aline escolheu Marina para disputar a Prova de Fogo, mas Rico não gostou nada da decisão da amiga. Se a gente não escolhe. Ninguém vai escolhe...\",\n" +
            "            \"url\": \"http://afazenda.r7.com/a-fazenda-13/24-horas/videos/rico-discute-com-aline-apos-sorteio-para-a-prova-de-fogo-a-fazenda-13-24102021\",\n" +
            "            \"urlToImage\": \"https://vtb.r7.com/399590/2021/10/24/6175a142cd77c0c709000972/9c8ce07f65b345ffa2e35dccd01fe6d4__611632_EMP_FA_1024_RICO_RAIVA_OK_thumb_thumb.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T18:21:05Z\",\n" +
            "            \"content\": null\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Istoe.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Da Redação\",\n" +
            "            \"title\": \"'Muito respeito', diz Graciele Lacerda sobre relação com filhas de Zezé Di Camargo - ISTOÉ\",\n" +
            "            \"description\": \"Graciele Lacerda contou de sua intimidade com as filhas de Zezé Di Camargo em entrevista à Fábia Oliveira, do site O Dia. A influenciadora explicou que a convivência com Wanessa e Camilla, do relacionamento do sertanejo com Zilu Godoi, é bastante pacífica. + …\",\n" +
            "            \"url\": \"https://istoe.com.br/muito-respeito-diz-graciele-lacerda-sobre-relacao-com-filhas-de-zeze-di-camargo/\",\n" +
            "            \"urlToImage\": \"https://istoe.com.br/wp-content/uploads/sites/14/2021/08/graciele-larcerda-zeze.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T18:07:00Z\",\n" +
            "            \"content\": \"Nota de esclarecimento\\r\\nA Três Comércio de Publicaçõs Ltda. (EDITORA TRÊS) vem informar aos seus consumidores que não realiza cobranças por telefone e que também não oferece cancelamento do contrato … [+316 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Omelete.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Omelete\",\n" +
            "            \"title\": \"Com US$ 40 milhões, Duna tem melhor estreia da Warner na pandemia - Omelete\",\n" +
            "            \"description\": \"Filme ficou em primeiro lugar nas bilheterias americanas\",\n" +
            "            \"url\": \"https://www.omelete.com.br/bilheteria-usa/22-outubro-2021\",\n" +
            "            \"urlToImage\": \"https://cdn.ome.lt/ENTGWHk4M_dXvOi1IIEQuMd47c8=/1200x630/smart/uploads/bilheteria/images/duna.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T16:45:00Z\",\n" +
            "            \"content\": \"Duna se saiu bem em sua estreia nas bilheterias norte-americanas. O filme de Dennis Villeneuve arecadou US$ 40,1 milhões, ocupando o primeiro lugar do ranking. \\r\\nFoi a melhor estreia da Warner Bros. … [+735 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"globo\",\n" +
            "                \"name\": \"Globo\"\n" +
            "            },\n" +
            "            \"author\": \"O Globo\",\n" +
            "            \"title\": \"Alec Baldwin cancela próximos projetos após morte acidental de cineasta - Jornal O Globo\",\n" +
            "            \"description\": \"Fonte disse à revista People que Baldwin ficou 'histérico e absolutamente inconsolável por horas' depois do tiroteio no set de filmagens de 'Rust'\",\n" +
            "            \"url\": \"https://oglobo.globo.com/cultura/filmes/alec-baldwin-cancela-proximos-projetos-apos-morte-acidental-de-cineasta-25249647\",\n" +
            "            \"urlToImage\": \"https://ogimg.infoglobo.com.br/in/25247377-ef4-748/FT1086A/760/Alec-Baldwin.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T16:42:06Z\",\n" +
            "            \"content\": \"O ator Alec Baldwin decidiu cancelar seus projetos após o disparo que matou acidentalmente a cineasta Halyna Hutchins e feriu o diretor Joel Souza no set de seu próximo filme ''Rust''. Uma fonte diss… [+4151 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Em.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Ricardo Daehn - Correio Braziliense\",\n" +
            "            \"title\": \"Wagner Moura sobre Bolsonaro: 'Conectado ao esgoto da história' - Estado de Minas\",\n" +
            "            \"description\": \"Em entrevista de pré-lançamento do filme Marighella, diretor Wagner Moura criou sensação no Twitter, a partir de ataques ao governo; declaração viralizou\",\n" +
            "            \"url\": \"https://www.em.com.br/app/noticia/politica/2021/10/24/interna_politica,1316623/wagner-moura-sobre-bolsonaro-conectado-ao-esgoto-da-historia.shtml\",\n" +
            "            \"urlToImage\": \"https://i.em.com.br/SQkohLD3jZmD16IcZ4ZlCotkeDc=/600x315/smart/imgsapp.em.com.br/app/noticia_127983242361/2021/10/24/1316623/wagner-moura-nao-poupou-criticas-a-bolsonaro_0.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T16:38:00Z\",\n" +
            "            \"content\": \"Aproveite o melhor do Estado de Minas: contedos exclusivos, colunistas renomados e muitos benefcios para voc.\\r\\nASSINE AGORAUtilizamos tecnologia e segurana do Google para fazer a assinatura.\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Metropoles.com\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Atriz Elizangela sofre acidente doméstico e quebra os dois braços - Metrópoles\",\n" +
            "            \"description\": \"Ela estava em sua casa, escorregou no quintal e teve que ser levada para o hospital após sofrer fraturas\",\n" +
            "            \"url\": \"https://www.metropoles.com/colunas/leo-dias/atriz-elizangela-sofre-acidente-domestico-e-quebra-os-dois-bracos\",\n" +
            "            \"urlToImage\": \"https://uploads.metropoles.com/wp-content/uploads/2021/10/24133035/Elizangela-1.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T16:31:00Z\",\n" +
            "            \"content\": \"A atriz Elizangela passou por um enorme susto em sua casa e foi parar no hospital. Ela escorregou no quintal, caiu de cara no chão e fraturou os dois antebraços. Agora ela está com os dois membros en… [+941 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Uai.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Portal Uai Entretenimento, Portal Uai Entretenimento\",\n" +
            "            \"title\": \"Eliana muda visual e surge de cabelo curtinho no Teleton 2021: 'No estilo' - Portal Uai\",\n" +
            "            \"description\": \"Apresentadora estreou look com as madeixas curtas na abertura do evento solid�rio\",\n" +
            "            \"url\": \"https://www.uai.com.br/app/noticia/famosos/2021/10/24/interna-famosos,280318/eliana-muda-visual-e-surge-de-cabelo-curtinho-no-teleton-2021-no-estilo.shtml\",\n" +
            "            \"urlToImage\": \"https://i.uai.com.br/IIXyjxoVoVIJp5kQc4EmANQZG-A=/600x315/smart/imgsapp2.uai.com.br/app/noticia_133890394703/2021/10/24/280318/20211024133646961422e.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T16:16:00Z\",\n" +
            "            \"content\": \"A apresentadora \\r\\nEliana\\r\\n \\r\\nestreou um novo visual na abertura do Teleton 2021, no\\r\\nSBT\\r\\n, e surpreendeu fs com a mudana. O visual da apresentadora foi motivada pela participao como madrinha do even… [+1598 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Ig.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"O Dia\",\n" +
            "            \"title\": \"Ator de 'Riverdale' gera polêmica ao beber café com leite materno da esposa: 'Eu amo' - O Dia\",\n" +
            "            \"description\": \"KJ Apa se tornou pai no final de setembro\",\n" +
            "            \"url\": \"https://odia.ig.com.br/diversao/celebridades/2021/10/6261622-ator-de-riverdale-gera-polemica-ao-beber-cafe-com-leite-materno-da-esposa-eu-amo.html\",\n" +
            "            \"urlToImage\": \"https://odia.ig.com.br/_midias/jpg/2021/10/24/1200x750/1_kj_apa-23389869.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T16:16:00Z\",\n" +
            "            \"content\": \"Após fim de namoro, Viih Tube é vista aos beijos com influenciador em balada\\r\\nInfluenciadora, por sua vez, disse que não tem pretensão de começar um outro relacionamento em breve\\r\\nPublicado há 3 horas\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Sbt.com.br\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Internautas criticam aparência de Luísa Sonza e cantora ironiza: \\\"É meu fim mesmo\\\" - SBT\",\n" +
            "            \"description\": null,\n" +
            "            \"url\": \"https://www.sbt.com.br/jornalismo/fofocalizando/noticia/184382-internautas-criticam-aparencia-de-luisa-sonza-e-cantora-ironiza-e-meu-fim-mesmo\",\n" +
            "            \"urlToImage\": null,\n" +
            "            \"publishedAt\": \"2021-10-24T15:55:00Z\",\n" +
            "            \"content\": null\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Uol.com.br\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Palco pega fogo no meio de show da dupla Henrique & Diego em SP, e apresentação é interrompida; assista ao vídeo - Hugo Gloss\",\n" +
            "            \"description\": \"Eita! Henrique e Diego tiveram que paralisar um show realizado nesse sábado (23), após um incêndio se espalhar pelo palco e destruir parte da estrutura montada no local. A apresentação, que contou com participações especiais de Dennis DJ e da dupla Vini & Luc…\",\n" +
            "            \"url\": \"https://hugogloss.uol.com.br/famosos/palco-pega-fogo-no-meio-de-show-da-dupla-henrique-assista-ao-video/\",\n" +
            "            \"urlToImage\": \"https://media.hugogloss.uol.com.br/uploads/2021/10/fotojet-45.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T15:23:00Z\",\n" +
            "            \"content\": \"Eita! Henrique e Diego tiveram que paralisar um show realizado nesse sábado (23), após um incêndio se espalhar pelo palco e destruir parte da estrutura montada no local. A apresentação, que contou co… [+1017 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Uol.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"REDAÇÃO\",\n" +
            "            \"title\": \"A Fazenda ou Verdades Secretas? Peoas discutem aumento peniano de Tiago - Notícias da TV\",\n" +
            "            \"description\": \"Paqueras do passado, Valentina Francavilla e Solange Gomes concordaram que o ex-affair Tiago Piquilo não precisava ter feito uma cirurgia para aumentar sua parte íntima.\",\n" +
            "            \"url\": \"https://noticiasdatv.uol.com.br/noticia/a-fazenda/fazenda-ou-verdades-secretas-peoas-discutem-aumento-peniano-de-tiago-68126\",\n" +
            "            \"urlToImage\": \"https://noticiasdatv.uol.com.br/media/uploads/artigos_2021/tiago-piquilo-a-fazenda-13-dia-23-10-21_reproducao-record.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T15:10:00Z\",\n" +
            "            \"content\": \"Os telespectadores que assistiram a A Fazenda 13 durante a noite de sábado (23) podem ter se perguntado se estavam no streaming certo, já que a pauta do reality da Record foi tão apimentada que poder… [+1409 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Uol.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"UOL\",\n" +
            "            \"title\": \"Reese Witherspoon celebra aniversário do filho com o ex, Ryan Phillippe - UOL\",\n" +
            "            \"description\": \"A atriz Reese Witherspoon comemorou o aniversário de 18 anos do seu filho Deacon com o ex-marido, Ryan Phillippe, pai do jovem. Em um local que parece um restaurante, os três aparecem juntos e abraçados em frente a um bolo com as velas que indicam a idade\",\n" +
            "            \"url\": \"https://tvefamosos.uol.com.br/noticias/redacao/2021/10/24/reese-witherspoon-celebra-aniversario-do-filho-com-o-ex-ryan-phillippe.htm\",\n" +
            "            \"urlToImage\": \"https://conteudo.imguol.com.br/c/entretenimento/55/2021/10/24/ryan-phillippe-reese-witherspoon-e-o-filho-do-casal-deacon-philippe-1635087082933_v2_615x300.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T15:09:00Z\",\n" +
            "            \"content\": \"A atriz Reese Witherspoon comemorou o aniversário de 18 anos do seu filho Deacon com o ex-marido, Ryan Phillippe, pai do jovem. Em um local que parece um restaurante, os três aparecem juntos e abraça… [+714 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Terra.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"carolineferreira\",\n" +
            "            \"title\": \"5 curiosidades de Maid, a minissérie mais vista da Netflix! - Terra\",\n" +
            "            \"description\": \"De acordo com dados da plataforma de streaming, a produção, lançada no dia 1ª de outubro, bateu a marca de \\\"O Gambito da Rainha\\\"\",\n" +
            "            \"url\": \"https://www.terra.com.br/diversao/gente/5-curiosidades-de-maid-a-minisserie-mais-vista-da-netflix,1fb9d798567897b61bcdc5b7a782b4cbnapsebcm.html\",\n" +
            "            \"urlToImage\": \"https://p2.trrsf.com/image/fget/cf/1200/628/middle/images.terra.com/2021/10/24/1909836234-maid.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T15:05:28Z\",\n" +
            "            \"content\": \"A Netflix já tem a sua nova minissérie queridinha. Segundo dados da própria plataforma de streaming, \\\"Maid\\\" ultrapassou a marca de \\\"O Gambito da Rainha\\\" e se tornou a mais vista. Com lançamento no di… [+2363 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Rd1.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Da Redação\",\n" +
            "            \"title\": \"Michel Teló muda planos e toma atitude drástica na carreira - RD1 - Terra\",\n" +
            "            \"description\": \"Após passar quase dois anos estando mais presente em casa, por causa da pandemia, Michel Teló decidiu que não quer voltar para a rotina intensa de shows que tinha antes.\",\n" +
            "            \"url\": \"https://rd1.com.br/michel-telo-muda-completamente-carreira-e-prioriza-familia/\",\n" +
            "            \"urlToImage\": \"https://rd1.com.br/wp-content/uploads/2019/10/20191013-michel-telo-thais-fersoza-melinda-teodoro.png\",\n" +
            "            \"publishedAt\": \"2021-10-24T14:54:53Z\",\n" +
            "            \"content\": \"Michel Teló está focado em passar mais tempo com a família (Imagem: Reprodução / Instagram)\\r\\nApós passar quase dois anos estando mais presente em casa, por causa da pandemia, Michel Teló decidiu que … [+2117 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"globo\",\n" +
            "                \"name\": \"Globo\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Gusttavo Lima faz show com aglomeração em boate de Goiânia; vídeo - G1\",\n" +
            "            \"description\": \"Apresentação chamada de “After Oficial do Embaixador” foi gravada por frequentadores da boate e compartilhada nas redes sociais. Decreto municipal prevê lotação máxima de 60%.\",\n" +
            "            \"url\": \"https://g1.globo.com/go/goias/noticia/2021/10/24/gusttavo-lima-faz-show-com-aglomeracao-em-boate-de-goiania-video.ghtml\",\n" +
            "            \"urlToImage\": \"https://s2.glbimg.com/GSLUVE6mGAWQ_keGsFBy--M7RYs=/1200x/smart/filters:cover():strip_icc()/s04.video.glbimg.com/x720/9976847.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T14:07:49Z\",\n" +
            "            \"content\": \"O cantor Gusttavo Lima fez um show em uma boate lotada em Goiânia após o evento-teste realizado no sábado (24). A apresentação, chamada de After Oficial do Embaixador foi gravada por frequentadores d… [+893 chars]\"\n" +
            "        }\n" +
            "    ]\n" +
            "}";

    private static String categoria_geral = "{\n" +
            "    \"status\": \"ok\",\n" +
            "    \"totalResults\": 34,\n" +
            "    \"articles\": [\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Oantagonista.com\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Deixe Milton Friedman fora dessa, Paulo Guedes - O Antagonista\",\n" +
            "            \"description\": \"Na sexta-feira, Paulo Guedes citou Milton Friedman como inspiração para o  Auxílio Brasil fura-teto, de 400 reais. Isso mostra que ele queria engambelar\",\n" +
            "            \"url\": \"https://www.oantagonista.com/brasil/deixe-milton-friedman-fora-dessa-paulo-guedes/\",\n" +
            "            \"urlToImage\": \"https://cdn.oantagonista.com/uploads/2021/06/paulo-guedes-ministro-1024x683.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T19:35:48Z\",\n" +
            "            \"content\": \"Na última sexta-feira, enquanto tentava convencer a audiência que sua concordância em furar o teto de gastos foi uma coisa, assim, totalmente normal e corriqueira, o ministro Paulo Guedes (foto) diss… [+2774 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Uol.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Colaboração para o UOL, em São Paulo\",\n" +
            "            \"title\": \"Quem são João Guilherme, Jade Picon e Gui Araujo e por que bombaram? - UOL\",\n" +
            "            \"description\": \"O final de semana para o público de A Fazenda 13 girou em torno de uma fofoca: a suposta traição envolvendo Jade Picon, João Guilherme e Gui Araujo.Esses três nomes ficaram entre os mais comentados no Twitter pois, na última festa do reality rural, Gui Ar\",\n" +
            "            \"url\": \"https://tvefamosos.uol.com.br/noticias/redacao/2021/10/24/quem-sao-jade-picon-joao-guilherme-e-gui-araujo-e-por-que-bombaram.htm\",\n" +
            "            \"urlToImage\": \"https://conteudo.imguol.com.br/c/entretenimento/b8/2021/10/23/a-fazenda-2021-joao-guilherme-afirma-que-nao-incitara-hate-para-a-ex-jade-picon-apos-suposta-traicao-1635031861272_v2_615x300.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T19:27:00Z\",\n" +
            "            \"content\": \"O final de semana para o público de A Fazenda 13 girou em torno de uma fofoca: a suposta traição envolvendo Jade Picon, João Guilherme e Gui Araujo.\\r\\nEsses três nomes ficaram entre os mais comentados… [+5115 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Cnnbrasil.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Estadão Conteúdo\",\n" +
            "            \"title\": \"Tempestade desliga 5 turbinas de Itaipu e obriga usina a verter água - CNN Brasil\",\n" +
            "            \"description\": \"Segundo a hidrelétrica, o temporal não trouxe qualquer impacto para as instalações da usina de Itaipu, que segue operando normalmente\",\n" +
            "            \"url\": \"https://www.cnnbrasil.com.br/business/tempestade-desliga-5-turbinas-de-itaipu-e-obriga-usina-a-verter-agua-2/\",\n" +
            "            \"urlToImage\": \"https://www.cnnbrasil.com.br/wp-content/uploads/sites/12/2021/10/usina-itaipu-2.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T19:14:00Z\",\n" +
            "            \"content\": \"Uma tempestade na região oeste do Paraná interrompeu no sábado (23) a operação de linhas de transmissão que conectam a usina hidrelétrica binacional de Itaipu ao Sistema Interligado Nacional (SIN), d… [+1091 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Oantagonista.com\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Defesa pede transferência de Jefferson para hospital: “Não há dúvidas do risco de morte” - O Antagonista\",\n" +
            "            \"description\": \"Presidente do PTB voltou a ser internado neste domingo no Complexo Penitenciário de Gericinó\",\n" +
            "            \"url\": \"https://www.oantagonista.com/brasil/defesa-pede-transferencia-de-jefferson-para-hospital-nao-ha-duvidas-do-risco-de-morte/\",\n" +
            "            \"urlToImage\": \"https://cdn.oantagonista.com/uploads/2021/07/Roberto-Jefferson-2-Agencia-Brasil-1024x683.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T18:52:00Z\",\n" +
            "            \"content\": \"A defesa de Roberto Jefferson (foto) pediu ao STF neste domingo a transferência do ex-deputado para um hospital na Barra da Tijuca, no Rio de Janeiro, alegando grave risco de vida.\\r\\nDe acordo com os … [+637 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"globo\",\n" +
            "                \"name\": \"Globo\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Funcionário de supermercado morre após queda de elevador na Zona Oeste do Rio - G1\",\n" +
            "            \"description\": \"Segundo informações preliminares, o acidente ocorreu na Estrada da Cachamorra, em Campo Grande, com um elevador de serviço que despencou. Lucas Matheus foi resgatado já sem vida, diz o Corpo de Bombeiros.\",\n" +
            "            \"url\": \"https://g1.globo.com/rj/rio-de-janeiro/noticia/2021/10/24/funcionario-de-supermercado-morre-apos-queda-de-elevador-na-zona-oeste-do-rio.ghtml\",\n" +
            "            \"urlToImage\": \"https://s2.glbimg.com/gdNSl4ALzGsdAHvTYjFNg-L3GuU=/1200x/smart/filters:cover():strip_icc()/i.s3.glbimg.com/v1/AUTH_59edd422c0c84a879bd37670ae4f538a/internal_photos/bs/2021/K/I/pnyKOZTAeRkxEIhKB4Zg/whatsapp-image-2021-10-24-at-14.41.43.jpeg\",\n" +
            "            \"publishedAt\": \"2021-10-24T18:26:54Z\",\n" +
            "            \"content\": \"Um funcionário de um supermercado morreu após a queda de um elevador na sede do mercado Rede Economia na noite de sábado (24). Segundo informações preliminares, o acidente ocorreu na Estrada da Cacha… [+460 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Itatiaia.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Rádio Itatiaia - A Rádio de Minas\",\n" +
            "            \"title\": \"Atlético x Cuiabá: clique e acompanhe ao vivo o jogo pelo Campeonato Brasileiro - Rádio Itatiaia\",\n" +
            "            \"description\": \"Após a goleada por 4 a 0 diante do Fortaleza, pelo jogo de ida da Copa do Brasil, o Atlético agora terá mais um...\",\n" +
            "            \"url\": \"https://www.itatiaia.com.br/noticia/atletico-x-cuiaba-clique-e-acompanhe-ao-vivo-o-jogo-pelo-campeonato-brasileiro\",\n" +
            "            \"urlToImage\": \"https://www.itatiaia.com.br/admin/Conteudo/noticias/182113/744x500/jogo-44424-10-2021_1.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T18:21:00Z\",\n" +
            "            \"content\": \"Foto: Pedro Souza/Atlético\\r\\nKeno em disputa de bola com os jogadores do Cuiabá\\r\\nApós a goleada por 4 a 0 diante do Fortaleza, pelo jogo de ida da Copa do Brasil, o Atlético agora terá mais uma “decis… [+1550 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Oantagonista.com\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Carne enviada à China segue parada em portos - O Antagonista\",\n" +
            "            \"description\": \"A decisão de retomada das exportações depende do país asiático, que ainda mantém o veto ao produto brasileiro\",\n" +
            "            \"url\": \"https://www.oantagonista.com/brasil/carne-enviada-a-china-segue-parada-em-portos/\",\n" +
            "            \"urlToImage\": \"https://cdn.oantagonista.com/uploads/2020/07/producao-de-carne-bovina-deve-superar-o-volume-de-consumo-em-2020.jpeg\",\n" +
            "            \"publishedAt\": \"2021-10-24T18:12:28Z\",\n" +
            "            \"content\": null\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Istoe.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Da Redação\",\n" +
            "            \"title\": \"'Muito respeito', diz Graciele Lacerda sobre relação com filhas de Zezé Di Camargo - ISTOÉ\",\n" +
            "            \"description\": \"Graciele Lacerda contou de sua intimidade com as filhas de Zezé Di Camargo em entrevista à Fábia Oliveira, do site O Dia. A influenciadora explicou que a convivência com Wanessa e Camilla, do relacionamento do sertanejo com Zilu Godoi, é bastante pacífica. + …\",\n" +
            "            \"url\": \"https://istoe.com.br/muito-respeito-diz-graciele-lacerda-sobre-relacao-com-filhas-de-zeze-di-camargo/\",\n" +
            "            \"urlToImage\": \"https://istoe.com.br/wp-content/uploads/sites/14/2021/08/graciele-larcerda-zeze.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T18:07:00Z\",\n" +
            "            \"content\": \"Nota de esclarecimento\\r\\nA Três Comércio de Publicaçõs Ltda. (EDITORA TRÊS) vem informar aos seus consumidores que não realiza cobranças por telefone e que também não oferece cancelamento do contrato … [+316 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Uol.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Marinho Saldanha\",\n" +
            "            \"title\": \"Aguirre confirma mudanças na zaga do Inter para pegar o Corinthians - UOL Esporte\",\n" +
            "            \"description\": \"Diego Aguirre não apresentou surpresas na escalação do Inter. Hoje (24), treinador só fez alterações inevitáveis. Na zaga, as ausências de Saravia e Bruno Méndez geram as principais mudanças.Méndez não poderia atuar pois pertence ao Corinthians. Ele ainda\",\n" +
            "            \"url\": \"https://www.uol.com.br/esporte/futebol/ultimas-noticias/2021/10/24/aguirre-confirma-mudancas-na-zaga-do-inter-para-pegar-o-corinthians.htm\",\n" +
            "            \"urlToImage\": \"https://conteudo.imguol.com.br/c/esporte/73/2021/08/22/gabriel-mercado-comemora-gol-marcado-pelo-internacional-contra-o-santos-1629670092848_v2_615x300.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T17:59:27Z\",\n" +
            "            \"content\": \"Diego Aguirre não apresentou surpresas na escalação do Inter. Hoje (24), treinador só fez alterações inevitáveis. Na zaga, as ausências de Saravia e Bruno Méndez geram as principais mudanças.\\r\\nMéndez… [+748 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"R7.com\"\n" +
            "            },\n" +
            "            \"author\": \"R7.com\",\n" +
            "            \"title\": \"Talibãs matam sequestradores vinculados ao Estado Islâmico - Notícias - R7 Internacional - HORA 7\",\n" +
            "            \"description\": \"Ação ocorreu durante três horas de confrontos na cidade de Herat, no oeste do Afeganistão\",\n" +
            "            \"url\": \"http://noticias.r7.com/internacional/talibas-matam-sequestradores-vinculados-ao-estado-islamico-24102021\",\n" +
            "            \"urlToImage\": \"https://img.r7.com/images/taliba-soldados-afeganistao-24102021142757477?dimensions=771x420&&amp;&amp;&amp;&amp;&amp;&amp;&amp;resize=771x420&amp;crop=827x450+0+46\",\n" +
            "            \"publishedAt\": \"2021-10-24T17:57:21Z\",\n" +
            "            \"content\": \"Os talibãs anunciaram neste domingo (24) ter matado três membros do grupo Estado Islâmico (EI) acusados de \\\"sequestros\\\", após três horas de confrontos na cidade de Herat, no oeste do Afeganistão.\\r\\n\\\"T… [+535 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Adrenaline.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Juliano Aires\",\n" +
            "            \"title\": \"GTA Trilogy Definitive Edition - Comparativo lado a lado com mudanças gráficas - Adrenaline\",\n" +
            "            \"description\": \"Jogo será lançado em 11 de novembro e já está em pré-venda\",\n" +
            "            \"url\": \"https://adrenaline.com.br/noticias/v/71661/gta-trilogy-definitive-edition-comparativo-lado-a-lado-com-mudancas-graficas\",\n" +
            "            \"urlToImage\": \"https://adrenaline.com.br/uploads/chamadas/grand-theft-auto-the-trilogy-the-definitive-edition-comparativo1.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T17:50:00Z\",\n" +
            "            \"content\": \"Desde que o jogo Grand Theft Auto: The Trilogy - The Definitive Edition foi anunciado oficialmente pelaRockstar Games, o que os fãs mais aguardavam eram por imagens que mostrassem a nova versão. A es… [+2242 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"globo\",\n" +
            "                \"name\": \"Globo\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Camisas usadas no Fla-Flu vão a leilão; peças de John Kennedy e Renê recebem maiores lances - globoesporte.com\",\n" +
            "            \"description\": \"Torcedores e colecionadores poderão fazer ofertas durante três semanas. Todas as camisas será desinfetada com tratamento de luz UV-C por medida de segurança\",\n" +
            "            \"url\": \"https://ge.globo.com/futebol/times/fluminense/noticia/camisas-usadas-no-fla-flu-vao-a-leilao-pecas-de-john-kennedy-e-rene-recebem-maiores-lances.ghtml\",\n" +
            "            \"urlToImage\": \"https://s2.glbimg.com/8DO4kXmj5yjUVa362gkGDrdrZL8=/1200x/smart/filters:cover():strip_icc()/i.s3.glbimg.com/v1/AUTH_bc8228b6673f488aa253bbcb03c80ec5/internal_photos/bs/2021/s/T/on71CkRlyEoTfXCgrl5w/fluaaa.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T17:11:05Z\",\n" +
            "            \"content\": \"Esta é para torcedores e colecionadores: as camisas utilizadas pelos jogadores de Fluminense e Flamengo no jogo deste sábado, no Maracanã, foram colocadas em leilão no site especializado MatchWornShi… [+1555 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Uol.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Denise Luna\",\n" +
            "            \"title\": \"Gás de cozinha volta a subir, acumula alta de 3,5% em outubro e chega a R$ 135 - UOL\",\n" +
            "            \"description\": \"O gás de cozinha voltou a subir na semana passada, em 1,5% na comparação com a semana anterior, e no mês de outubro já acumula alta de 3,5%, segundo dados da ANP (Agência Nacional do Petróleo, Gás Natural e Biocombustíveis).O preço mais alto foi encontrad\",\n" +
            "            \"url\": \"https://economia.uol.com.br/noticias/estadao-conteudo/2021/10/24/gas-de-cozinha-volta-a-subir-e-ja-acumula-alta-de-35-em-outubro.htm\",\n" +
            "            \"urlToImage\": \"https://conteudo.imguol.com.br/c/noticias/37/2021/04/22/imagem-representativa-amp-gas-de-cozinha-como-economizar-1619125669152_v2_615x300.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T16:57:00Z\",\n" +
            "            \"content\": \"O gás de cozinha voltou a subir na semana passada, em 1,5% na comparação com a semana anterior, e no mês de outubro já acumula alta de 3,5%, segundo dados da ANP (Agência Nacional do Petróleo, Gás Na… [+2419 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"globo\",\n" +
            "                \"name\": \"Globo\"\n" +
            "            },\n" +
            "            \"author\": \"O Globo\",\n" +
            "            \"title\": \"Alec Baldwin cancela próximos projetos após morte acidental de cineasta - Jornal O Globo\",\n" +
            "            \"description\": \"Fonte disse à revista People que Baldwin ficou 'histérico e absolutamente inconsolável por horas' depois do tiroteio no set de filmagens de 'Rust'\",\n" +
            "            \"url\": \"https://oglobo.globo.com/cultura/filmes/alec-baldwin-cancela-proximos-projetos-apos-morte-acidental-de-cineasta-25249647\",\n" +
            "            \"urlToImage\": \"https://ogimg.infoglobo.com.br/in/25247377-ef4-748/FT1086A/760/Alec-Baldwin.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T16:42:06Z\",\n" +
            "            \"content\": \"O ator Alec Baldwin decidiu cancelar seus projetos após o disparo que matou acidentalmente a cineasta Halyna Hutchins e feriu o diretor Joel Souza no set de seu próximo filme ''Rust''. Uma fonte diss… [+4151 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Oantagonista.com\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"“O PT não só pretende repetir os erros, como julga ter poder de apagar os crimes” - O Antagonista\",\n" +
            "            \"description\": \"Em editorial, o Estadão diz que o partido tenta reescrever a história do país para \\\"edulcorar sua trágica passagem pelo poder\\\"\",\n" +
            "            \"url\": \"https://www.oantagonista.com/brasil/o-pt-nao-so-pretende-repetir-os-erros-como-julga-ter-poder-de-apagar-os-crimes/\",\n" +
            "            \"urlToImage\": \"https://cdn.oantagonista.com/uploads/2021/10/Partido-dos-Trabalhadores-PT-1024x683.png\",\n" +
            "            \"publishedAt\": \"2021-10-24T16:41:33Z\",\n" +
            "            \"content\": \"Em editorial, o Estadão diz que o PT é incapaz de propor uma agenda positiva para o futuro do país e reconhecer os inúmeros erros do passado que resultaram na maior crise econômica, política e moral … [+765 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"globo\",\n" +
            "                \"name\": \"Globo\"\n" +
            "            },\n" +
            "            \"author\": \"Rodrigo Castro\",\n" +
            "            \"title\": \"Entidades médicas desmentem fala de Bolsonaro que relaciona vacina a HIV: 'Associação inexistente' - Jornal O Globo\",\n" +
            "            \"description\": \"Presidente disse em live que pessoas completamente imunizadas contra a Covid-19 estõ desenvolvendo síndrome de imunodeficiência adquirida 'muito mais rápido que o previsto'\",\n" +
            "            \"url\": \"https://oglobo.globo.com/saude/entidades-medicas-desmentem-fala-de-bolsonaro-que-relaciona-vacina-hiv-associacao-inexistente-25249641\",\n" +
            "            \"urlToImage\": \"https://ogimg.infoglobo.com.br/in/25249645-841-9fc/FT1086A/760/bolsonaro.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T16:31:16Z\",\n" +
            "            \"content\": \"RIO - A Sociedade Brasileira de Infectologia (SBI) desmentiu a fala do presidente Jair Bolsonaro, que relacionou as vacinas contra Covid-19 ao vírus da imunodeficiência humana (HIV), e repudiou \\\"toda… [+2145 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Yahoo Entertainment\"\n" +
            "            },\n" +
            "            \"author\": \"LANCE!\",\n" +
            "            \"title\": \"André Rizek recebe ameaça física pela web e rebate: 'Você acha que consegue, valentão?' - Yahoo Esportes\",\n" +
            "            \"description\": \"Internauta afirmou que tem vontade de 'moer' o apresentador 'na porrada'; jornalista fazia uma crítica a fome no Brasil\",\n" +
            "            \"url\": \"https://esportes.yahoo.com/noticias/andr%C3%A9-rizek-recebe-amea%C3%A7a-f%C3%ADsica-145027724.html\",\n" +
            "            \"urlToImage\": \"https://s.yimg.com/uu/api/res/1.2/u16RsbZgaOBV4ZZvqybLbQ--~B/aD00MzU7dz04NDY7YXBwaWQ9eXRhY2h5b24-/https://media.zenfs.com/pt/lance__99/e60558a20669eef096bb3f2c72bc66d7\",\n" +
            "            \"publishedAt\": \"2021-10-24T14:50:27Z\",\n" +
            "            \"content\": \"O jornalista do SporTV André Rizek rebateu um internauta que respondeu a uma mensagem postada por ele no Twitter, dizendo que tinha vontade de agredi-lo fisicamente. Na publicação, feita neste sábado… [+933 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Ig.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"iG\",\n" +
            "            \"title\": \"Mega-Sena acumula e próximo concurso deve pagar R$ 33 milhões | Economia | O Dia - O Dia\",\n" +
            "            \"description\": \"Os números sorteados foram 02 – 07 – 10 – 20 – 30 – 46\",\n" +
            "            \"url\": \"https://odia.ig.com.br/economia/2021/10/6261553-mega-sena-acumula-e-proximo-concurso-deve-pagar-rs-33-milhoes.html\",\n" +
            "            \"urlToImage\": \"https://odia.ig.com.br/_midias/jpg/2021/06/28/1200x750/1_mega_sena_11_2_450x300-22281249.jpeg\",\n" +
            "            \"publishedAt\": \"2021-10-24T14:45:42Z\",\n" +
            "            \"content\": \"Com mais de 1 bilhão de transações, Pix tem se tornado alvo de golpes; saiba como se proteger\\r\\nCom a chegada das modalidades 'saque' e 'troco', a plataforma deve vislumbrar um crescimento ainda maior… [+71 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"globo\",\n" +
            "                \"name\": \"Globo\"\n" +
            "            },\n" +
            "            \"author\": \"Mariana Muniz\",\n" +
            "            \"title\": \"Ao lado de Bolsonaro, Guedes diz que aprovação de reformas compensaria furo do teto de gastos - O Globo\",\n" +
            "            \"description\": \"Presidente foi a feira de exposições em Brasília acompanhado do ministro da Economia e negou possibilidade de demissão dele: 'A gente vai sair juntos (do governo)'\",\n" +
            "            \"url\": \"https://oglobo.globo.com/economia/ao-lado-de-bolsonaro-guedes-diz-que-aprovacao-de-reformas-compensaria-furo-do-teto-de-gastos-25249601\",\n" +
            "            \"urlToImage\": \"https://ogimg.infoglobo.com.br/in/25248517-196-25e/FT1086A/760/95838882_Brazilian-President-Jair-Bolsonaro-is-seen-during-a-press-conference-with-his-Economy-Minis.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T14:45:10Z\",\n" +
            "            \"content\": \"BRASILIA - Após a crise da última semana gerada pelo anúncio de que o governo federal iria furar o teto de gastos para pagar o Auxílio Brasil, o presidente Jair Bolsonaro foi a um evento público em B… [+8864 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"R7.com\"\n" +
            "            },\n" +
            "            \"author\": \"R7.com\",\n" +
            "            \"title\": \"Incor já planeja teste de vacina contra Covid-19 por spray nasal - HORA 7\",\n" +
            "            \"description\": \"Inédita, a vacina administrada por spray nasal do Instituto do Coração (Incor) pretende ser opção de dose de reforço\",\n" +
            "            \"url\": \"http://noticias.r7.com/saude/incor-ja-planeja-teste-de-vacina-contra-covid-19-por-spray-nasal-24102021\",\n" +
            "            \"urlToImage\": \"https://img.r7.com/images/spray-covid-20102021074453426?dimensions=771x420&\",\n" +
            "            \"publishedAt\": \"2021-10-24T14:34:00Z\",\n" +
            "            \"content\": \"Inédita, a vacina contra Covid-19 administrada por spray nasal do Instituto do Coração (Incor) pretende ser opção de dose de reforço. Após bons resultados com camundongos, é hora da testagem em human… [+2138 chars]\"\n" +
            "        }\n" +
            "    ]\n" +
            "}";

    private static String categoria_saude = "{\n" +
            "    \"status\": \"ok\",\n" +
            "    \"totalResults\": 70,\n" +
            "    \"articles\": [\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Istoedinheiro.com.br\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"É mentira que vacinados contra a covid têm desenvolvido AIDS - IstoÉ Dinheiro\",\n" +
            "            \"description\": null,\n" +
            "            \"url\": \"https://www.istoedinheiro.com.br/e-mentira-que-vacinados-contra-a-covid-tem-desenvolvido-aids/\",\n" +
            "            \"urlToImage\": \"https://www.istoedinheiro.com.br/wp-content/uploads/sites/17/2021/10/pfizer-8-e1635099683859.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T18:21:00Z\",\n" +
            "            \"content\": \"Em mais um ataque às vacinas, o presidente Jair Bolsonaro (sem partido) disse em sua live na última quinta-feira (21) que os vacinados estariam desenvolvendo AIDS após serem imunizados contra a covid… [+1354 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Uol.com.br\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Escândalos na saúde mostram como há médicos medíocres e mal formados - Folha de S.Paulo\",\n" +
            "            \"description\": \"Com uma faculdade a cada esquina, qualquer família que pagar pode ter seu filho graduado em medicina\",\n" +
            "            \"url\": \"https://www1.folha.uol.com.br/colunas/luizfelipeponde/2021/10/escandalos-na-saude-mostram-como-ha-medicos-mediocres-e-mal-formados.shtml\",\n" +
            "            \"urlToImage\": \"https://f.i.uol.com.br/fotografia/2021/10/24/163508899461757a629ffc5_1635088994_3x2_xl.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T16:44:00Z\",\n" +
            "            \"content\": \"Qualquer família de classe média alta do Brasil que conseguir pagar 10 a 15 mil reais por mês para uma faculdade de medicina pode ter seu filho médico à vontade.\\r\\nMedicina ainda é a profissão de maio… [+3948 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Opovo.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"O Povo\",\n" +
            "            \"title\": \"Segundo semestre de 2021 registra aumento de doenças respiratórias em crianças, em Fortaleza - O POVO\",\n" +
            "            \"description\": \"Entre as doenças classificadas como respiratórias nos sistemas de saúde estão sinusite, faringite, laringite e asma\",\n" +
            "            \"url\": \"https://www.opovo.com.br/noticias/ceara/2021/10/24/segundo-semestre-de-2021-registra-aumento-de-doencas-respiratorias-em-criancas.html\",\n" +
            "            \"urlToImage\": \"https://www.opovo.com.br/_midias/jpg/2021/08/18/818x460/1_espaco___mais___infancia___livros___crianca_17-16863309.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T16:35:00Z\",\n" +
            "            \"content\": \"Coleguinhas doentes na sala, maior exposição, ventos mais fortes, época da floração do caju: são alguns dos motivos para que mais crianças tenham procurado assistência médica no segundo semestre de 2… [+11306 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"R7.com\"\n" +
            "            },\n" +
            "            \"author\": \"R7.com\",\n" +
            "            \"title\": \"Atendimentos de saúde mental caem 28% durante a pandemia - HORA 7\",\n" +
            "            \"description\": \"Dado é de estudo brasileiro publicado na renomada revista The Lancet, que indica ainda queda de internações psiquiátricas\",\n" +
            "            \"url\": \"http://noticias.r7.com/saude/atendimentos-de-saude-mental-caem-28-durante-a-pandemia-24102021\",\n" +
            "            \"urlToImage\": \"https://img.r7.com/images/paciente-de-saude-mental-atendimentos-cairam-na-pandemia-24102021130622756?dimensions=771x420&\",\n" +
            "            \"publishedAt\": \"2021-10-24T16:12:00Z\",\n" +
            "            \"content\": \"Um estudo de pesquisadores brasileiros publicado no periódico internacional The Lancet apontou uma queda do atendimento em saúde mental durante a pandemia. O trabalho indicou o impacto da pandemia da… [+1582 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Terra.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"redaçãosportlife\",\n" +
            "            \"title\": \"Mamão: 8 benefícios além do combate ao intestino preso - Terra\",\n" +
            "            \"description\": \"Nutricionista aponta as vantagens que a fruta pode proporcionar para a saúde\",\n" +
            "            \"url\": \"https://www.terra.com.br/vida-e-estilo/saude/bem-estar/mamao-8-beneficios-alem-do-combate-ao-intestino-preso,252e3e700b206a33fc4f85a83f3294160yf1upt9.html\",\n" +
            "            \"urlToImage\": \"https://p2.trrsf.com/image/fget/cf/1200/628/middle/images.terra.com/2021/10/24/76906846-shutterstock1906775701-1.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T15:44:30Z\",\n" +
            "            \"content\": \"O mamão, fruta muito popular no Brasil, é conhecida por sua poderosa função de \\\"soltar o intestino\\\". Provavelmente alguém já te sugeriu o consumo do alimento com a finalidade de melhorar o trato gast… [+3168 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Opresente.com.br\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Obras do complexo que vai abrigar o hospital da Unimed Costa Oeste devem começar em janeiro em Marechal Rondon - O Presente\",\n" +
            "            \"description\": \"Quem passa pela área que vai receber o complexo que vai abrigar o hospital da Unimed Costa Oeste, no prolongamento da Avenida Írio Jacob Welp, nas proximidades do Anel Viário de Marechal Cândido Rondon, pode verificar uma movimentação no local. A área já foi …\",\n" +
            "            \"url\": \"https://www.opresente.com.br/marechal-candido-rondon/obras-do-complexo-que-vai-abrigar-o-hospital-da-unimed-costa-oeste-devem-comecar-em-janeiro-em-marechal-rondon/\",\n" +
            "            \"urlToImage\": \"https://i2.wp.com/www.opresente.com.br/wp-content/uploads/2021/07/thumbnail_IMG_1632-e1625840428993.jpg?resize=1000%2C700&ssl=1\",\n" +
            "            \"publishedAt\": \"2021-10-24T14:16:10Z\",\n" +
            "            \"content\": \"Quem passa pela área que vai receber o complexo que vai abrigar o hospital da Unimed Costa Oeste, no prolongamento da Avenida Írio Jacob Welp, nas proximidades do Anel Viário de Marechal Cândido Rond… [+2387 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"globo\",\n" +
            "                \"name\": \"Globo\"\n" +
            "            },\n" +
            "            \"author\": \"Nelson Lima Neto\",\n" +
            "            \"title\": \"Hospital da Unimed Rio atinge menor número de internações por Covid-19 no ano - Jornal O Globo\",\n" +
            "            \"description\": \"Uma análise dos dados de atendimento de setembro no Hospital Unimed-Rio, referência da operadora de planos de saúde para o atendimento da Covid-19...\",\n" +
            "            \"url\": \"https://blogs.oglobo.globo.com/ancelmo/post/hospital-da-unimed-rio-atinge-menor-numero-de-internacoes-por-covid-19-no-ano.html\",\n" +
            "            \"urlToImage\": \"https://s2.glbimg.com/J6qtWxAlaRXSATAoK7svkbpFdnw=/640x424/top/i.glbimg.com/og/ig/infoglobo1/f/original/2021/03/23/unimed.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T14:00:00Z\",\n" +
            "            \"content\": \"O número de internações foi o menor registrado em 2021 e representa uma queda de 80% em relação ao pico de infecções este ano, em abril. \\r\\nNa emergência para pacientes com sintomas respiratórios da u… [+152 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Correiodoscampos.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"@CorreioCampos\",\n" +
            "            \"title\": \"Falta de desejo sexual pode estar ligado a problemas de saúde - Correio dos Campos\",\n" +
            "            \"description\": \"Pesquisa aponta aumento da insatisfação sexual de 7,4% para 53,3% durante a pandemia\",\n" +
            "            \"url\": \"https://correiodoscampos.com.br/arapoti/2021/10/24/falta-de-desejo-sexual-pode-estar-ligado-a-problemas-de-saude\",\n" +
            "            \"urlToImage\": \"https://correiodoscampos.com.br/wp-content/uploads/2021/10/whatsapp-image-2021-10-19-at-14-20-46-880x587.jpeg\",\n" +
            "            \"publishedAt\": \"2021-10-24T13:58:00Z\",\n" +
            "            \"content\": \"COM ASSESSORIAS – Segundo a pesquisa do UOL AD LAB, que avaliou como anda a saúde mental dos brasileiros e o que mudou na rotina, nos hábitos e na forma de pensar durante a pandemia, 28% responderam … [+2772 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Verdesmares.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Thatiany Nascimento\",\n" +
            "            \"title\": \"Pandemia acentua uso abusivo de álcool e amplia alerta sobre necessidade de garantia de tratamento - Diário do Nordeste\",\n" +
            "            \"description\": \"Uma droga socialmente aceita, cujo consumo, culturalmente, não costuma ser mal visto. Também por isso, quando o uso de álcool é abusivo e, portanto, problemático, o enfrentamento à situação é mais\",\n" +
            "            \"url\": \"https://diariodonordeste.verdesmares.com.br/metro/pandemia-acentua-uso-abusivo-de-alcool-e-amplia-alerta-sobre-necessidade-de-garantia-de-tratamento-1.3151476\",\n" +
            "            \"urlToImage\": \"https://diariodonordeste.verdesmares.com.br/image/contentid/policy:1.3151481:1635006202/image.jpg?h=630&q=0.6&w=1200&$p$h$q$w=f76cc5e\",\n" +
            "            \"publishedAt\": \"2021-10-24T13:31:31Z\",\n" +
            "            \"content\": \"Uma droga socialmente aceita, cujo consumo, culturalmente, não costuma ser mal visto. Também por isso, quando o uso de álcool é abusivo e, portanto, problemático, o enfrentamento à situação é mais co… [+8153 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Arede.info\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"PG destina doses de reforço para profissionais de saúde - ARede\",\n" +
            "            \"description\": \"Imunizantes remanescentes da Pfizer serão aplicados neste domingo (24), das 13h às 17h\",\n" +
            "            \"url\": \"https://arede.info/ponta-grossa/398274/pg-destina-doses-de-reforco-para-profissionais-de-saude\",\n" +
            "            \"urlToImage\": \"https://arede.info/img/normal/390000/Reproducao-Agencia-Brasil003975010202110182003-md_00398274_0_202110241006.jpg?xid=1151101\",\n" +
            "            \"publishedAt\": \"2021-10-24T13:06:00Z\",\n" +
            "            \"content\": \"Imunizantes remanescentes da Pfizer serão aplicados neste domingo (24), das 13h às 17h\\r\\nA Fundação Municipal de Saúde (FMS), através do Departamento de Imunização e da Atenção Primária, vai realizar … [+1234 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Ebc.com.br\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Estudo aponta redução de atendimentos de saúde mental durante pandemia - Agência Brasil\",\n" +
            "            \"description\": \"Nos seis primeiros meses do surto sanitário, foram registrados 1,1 milhão de atendimentos ambulatoriais ligados à saúde mental - número 28% abaixo do esperado para o período.\",\n" +
            "            \"url\": \"https://agenciabrasil.ebc.com.br/saude/noticia/2021-10/estudo-aponta-reducao-de-atendimentos-de-saude-mental-durante-pandemia\",\n" +
            "            \"urlToImage\": \"https://imagens.ebc.com.br/3RPi53KmDvP9szRCfgMMJnCRxMA=/1600x800/https://agenciabrasil.ebc.com.br/sites/default/files/thumbnails/image/mcmgo_abr_070820180689.jpg?itok=xs6Q6Z9Z\",\n" +
            "            \"publishedAt\": \"2021-10-24T12:33:00Z\",\n" +
            "            \"content\": \"Um estudo de pesquisadores brasileiros publicado no periódico internacional The Lancet apontou uma queda do atendimento de saúde mental durante a pandemia. O trabalho indicou o impacto da pandemia da… [+1592 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Acordacidade.com.br\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Secretaria de Saúde já realizou 48 mil exames para diagnóstico da Covid este ano - Acorda Cidade\",\n" +
            "            \"description\": \"Exame continua sendo feito em drive in na avenida Noide Cerqueira\",\n" +
            "            \"url\": \"https://www.acordacidade.com.br/noticias/250338/secretaria-de-saude-ja-realizou-48-mil-exames-para-diagnostico-da-covid-este-ano.html\",\n" +
            "            \"urlToImage\": \"https://www.acordacidade.com.br/fotos/p/221314-3.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T12:29:00Z\",\n" +
            "            \"content\": \"Acorda Cidade\\r\\nO incômodo é passageiro, mas permite o diagnóstico da Covid-19. Com um pequeno bastonete, que lembra um cotonete, profissionais da Secretaria Municipal de Saúde colhem a amostra para o… [+1014 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"globo\",\n" +
            "                \"name\": \"Globo\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Estudo alerta sobre 'pandemia paralela' na saúde mental e risco de sobrecarga nas consultas após vacinação contra Covid - G1\",\n" +
            "            \"description\": \"Isolamento reprimiu 471 mil atendimentos de psiquiatria e psicoterapia no país, diz pesquisadora da UnB, que participou de levantamento publicado em revista científica internacional. 'País precisa investir mais para atender a população, sob risco de impactos …\",\n" +
            "            \"url\": \"https://g1.globo.com/df/distrito-federal/noticia/2021/10/24/estudo-alerta-sobre-pandemia-paralela-na-saude-mental-e-risco-de-sobrecarga-nas-consultas-apos-vacinacao-contra-covid.ghtml\",\n" +
            "            \"urlToImage\": \"https://s2.glbimg.com/l1m5QFfVGlg6gusBaHDsesE336s=/1200x/smart/filters:cover():strip_icc()/i.s3.glbimg.com/v1/AUTH_59edd422c0c84a879bd37670ae4f538a/internal_photos/bs/2021/7/r/jEH20CTfKB2PocRG281g/50091247208-5efae84735-k.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T12:00:18Z\",\n" +
            "            \"content\": \"Junto à pandemia da Covid-19, existe uma \\\"pandemia paralela\\\" que demanda atendimentos para a saúde mental. O cenário foi observado por pesquisadores brasileiros em artigo, publicado na revista cientí… [+6412 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Correiobraziliense.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Raquel Ribeiro*\",\n" +
            "            \"title\": \"Shots de alimentos funcionais são aliados para manter boa saúde - Correio Braziliense\",\n" +
            "            \"description\": \"Populares durante a pandemia, os shots são grandes aliados de uma alimentação equilibrada e oferecem diversos benefícios à saúde. Saiba quais combinações de alimentos funcionais podem ser feitas\",\n" +
            "            \"url\": \"https://www.correiobraziliense.com.br/revista-do-correio/2021/10/4957522-shots-de-alimentos-funcionais-sao-aliados-para-manter-boa-saude.html\",\n" +
            "            \"urlToImage\": \"https://midias.correiobraziliense.com.br/_midias/jpg/2021/10/23/675x450/1_cbnfot181020212421-6953432.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T12:00:00Z\",\n" +
            "            \"content\": \"Os shots são os queridinhos quando o objetivo é turbinar a dieta alimentar. Graças às propriedades nutricionais que possuem, eles podem oferecer maior qualidade de vida, além de vários benefícios par… [+8361 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"google-news\",\n" +
            "                \"name\": \"Google News\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Formação de alto nível na área da saúde - Educação Estadão\",\n" +
            "            \"description\": null,\n" +
            "            \"url\": \"https://news.google.com/__i/rss/rd/articles/CBMiYmh0dHBzOi8vZWR1Y2FjYW8uZXN0YWRhby5jb20uYnIvbm90aWNpYXMvZ2VyYWwsZm9ybWFjYW8tZGUtYWx0by1uaXZlbC1uYS1hcmVhLWRhLXNhdWRlLDcwMDAzODc2Nzky0gFmaHR0cHM6Ly9lZHVjYWNhby5lc3RhZGFvLmNvbS5ici9ub3RpY2lhcy9nZXJhbCxmb3JtYWNhby1kZS1hbHRvLW5pdmVsLW5hLWFyZWEtZGEtc2F1ZGUsNzAwMDM4NzY3OTIuYW1w?oc=5\",\n" +
            "            \"urlToImage\": null,\n" +
            "            \"publishedAt\": \"2021-10-24T11:00:18Z\",\n" +
            "            \"content\": null\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Canaltech.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Luciana Zaramela\",\n" +
            "            \"title\": \"Giro da Saúde: Rússia, Delta Plus e lockdown; transplante de rim suíno em humano - Canaltech\",\n" +
            "            \"description\": \"Todo domingo, o Canaltech traz um resumo dos principais destaques para você se informar sobre o que aconteceu no campo da saúde. Vamos a mais um Giro!\",\n" +
            "            \"url\": \"https://canaltech.com.br/saude/russia-delta-plus-e-lockdown-transplante-de-rim-de-porco-em-humano-199696/\",\n" +
            "            \"urlToImage\": \"https://t.ctcdn.com.br/o0n2DVrLny5tSuuQ6Fj9sFL15ic=/1400x788/smart/i521278.jpeg\",\n" +
            "            \"publishedAt\": \"2021-10-24T11:00:00Z\",\n" +
            "            \"content\": \"Outubro está chegando ao fim e tivemos uma semana com grandes inovações no ramo da saúde. E o Canaltech traz, todo domingo, um resumo dos principais destaques para você se informar, bem rapidinho, so… [+5821 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Verdesmares.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Theyse Viana\",\n" +
            "            \"title\": \"Por que ‘velhice’ será tratada como doença pela OMS e o que dizem os especialistas sobre o assunto - Diário do Nordeste\",\n" +
            "            \"description\": \"Nascer, crescer, envelhecer e morrer. Desde crianças, aprendemos que esse é o ciclo natural da vida. A partir de janeiro de 2022, porém, essa noção pode mudar: a “velhice” poderá ser entendida como doença, por decisão da Organizaç\",\n" +
            "            \"url\": \"https://diariodonordeste.verdesmares.com.br/metro/por-que-velhice-sera-tratada-como-doenca-pela-oms-e-o-que-dizem-os-especialistas-sobre-o-assunto-1.3151166\",\n" +
            "            \"urlToImage\": \"https://diariodonordeste.verdesmares.com.br/image/contentid/policy:1.3151188:1634927658/image.jpg?h=630&q=0.6&w=1200&$p$h$q$w=f76cc5e\",\n" +
            "            \"publishedAt\": \"2021-10-24T10:00:00Z\",\n" +
            "            \"content\": \"Nascer, crescer, envelhecer e morrer. Desde crianças, aprendemos que esse é o ciclo natural da vida. A partir de janeiro de 2022, porém, essa noção pode mudar: a velhice poderá ser entendida como doe… [+4698 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Uol.com.br\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Pandemia e alta do dólar empurram cerca de 50 mil para fila de cirurgia cardíaca no SUS - Folha de S.Paulo\",\n" +
            "            \"description\": \"Insumos ficaram mais caros, com valores muito acima dos que o governo federal repassa aos hospitais\",\n" +
            "            \"url\": \"https://www1.folha.uol.com.br/equilibrioesaude/2021/10/pandemia-e-alta-do-dolar-empurram-cerca-de-50-mil-para-fila-de-cirurgia-cardiaca-no-sus.shtml\",\n" +
            "            \"urlToImage\": \"https://f.i.uol.com.br/fotografia/2021/04/05/1617650290606b6272f05a8_1617650290_3x2_rt.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T10:00:00Z\",\n" +
            "            \"content\": \"A pandemia da Covid-19 e a alta do dólar travaram ainda mais as cirurgias cardíacas no SUS. O problema da escassez de recursos para procedimentos eletivos é crônico, mas agora piorou.\\r\\nEntidades médi… [+7700 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Faroldenoticias.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"\",\n" +
            "            \"title\": \"Praça do Rodeio recebe ação do Farol e Secretaria de Saúde - Farol de Notícias\",\n" +
            "            \"description\": \"saiba mais\",\n" +
            "            \"url\": \"https://faroldenoticias.com.br/praca-do-rodeio-recebeu-acao-social-do-farol-e-secretaria-de-saude/\",\n" +
            "            \"urlToImage\": \"https://faroldenoticias.com.br/wp-content/uploads/2021/10/rodeio-4-st-4.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T08:12:25Z\",\n" +
            "            \"content\": \"Fotos: Farol de Notícias/Manu Silva, especial para o Farol\\r\\nPublicado às 05h10 deste domingo (24)\\r\\nPor Manu Silva\\r\\nMais um sábado de cuidados com a saúde e o agradável encontro do Grupo Farol de Notí… [+776 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Jcnet.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"JCNET\",\n" +
            "            \"title\": \"UPAs fazem 10 anos e pressionam por mudanças em unidades básicas de saúde - JCNET - Jornal da Cidade de Bauru\",\n" +
            "            \"description\": \"Unidades de urgência tornaram-se principal porta de acesso à saúde pública, na cidade, até para casos mais simples\",\n" +
            "            \"url\": \"https://www.jcnet.com.br/noticias/geral/2021/10/778649-upas-fazem-10-anos-e-pressionam-por-mudancas-em-unidades-basicas-de-saude.html\",\n" +
            "            \"urlToImage\": \"https://www.jcnet.com.br/_midias/jpg/2021/10/22/malav45253-4250298.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T08:00:00Z\",\n" +
            "            \"content\": \"1 Malavolta Jr.\\r\\nMovimento na UPA do Bela Vista, na última sexta (22), à noite\\r\\nA criação das Unidades de Pronto Atendimento (UPAs) em Bauru completou 10 anos em 2021 e, neste período, o serviço se t… [+10805 chars]\"\n" +
            "        }\n" +
            "    ]\n" +
            "}";

    private static String categoria_ciencia = "{\n" +
            "    \"status\": \"ok\",\n" +
            "    \"totalResults\": 70,\n" +
            "    \"articles\": [\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Forbes.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Jamie Carter\",\n" +
            "            \"title\": \"Cientistas descobrem asteroides com mais metais do que as reservas terrestres - Forbes Brasil\",\n" +
            "            \"description\": \"Mineração espacial tem sido comentada nos últimos anos, mas a tecnologia para buscar metais raros em asteroides ainda está um pouco distante\",\n" +
            "            \"url\": \"https://forbes.com.br/forbes-tech/2021/10/cientistas-descobrem-asteroides-com-mais-metais-do-que-as-reservas-terrestres/\",\n" +
            "            \"urlToImage\": \"https://forbes.com.br/wp-content/uploads/2021/10/Capturar-2-1024x683.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T18:35:09Z\",\n" +
            "            \"content\": \"16 Psyche, o grande asteroide metálico ideal para mineração espacial, que só deve ser alcançado em 2026\\r\\nSabemos que a era das viagens espaciais privadas chegou, mas e quanto à ampla indústria espaci… [+2221 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"BBC News\"\n" +
            "            },\n" +
            "            \"author\": \"https://www.facebook.com/bbcnews\",\n" +
            "            \"title\": \"‘Caçadores de vírus’: os cientistas que buscam a origem da próxima pandemia - BBC Brasil\",\n" +
            "            \"description\": \"Virologistas de várias partes do mundo vasculham a natureza atrás de agentes infecciosos desconhecidos, que podem afetar a humanidade no futuro. Entenda a importância desse trabalho e como ele nos permitirá estar mais preparados para a próxima crise sanitária.\",\n" +
            "            \"url\": \"https://www.bbc.com/portuguese/geral-58934975\",\n" +
            "            \"urlToImage\": \"https://ichef.bbci.co.uk/news/1024/branded_portuguese/175F2/production/_121103759_1.png\",\n" +
            "            \"publishedAt\": \"2021-10-24T18:16:30Z\",\n" +
            "            \"content\": \"<ul><li>André Biernath - @andre_biernath</li><li>Da BBC News Brasil em São Paulo</li></ul>\\r\\nCrédito, Getty Images\\r\\nLegenda da foto, Os morcegos são uma das principais 'fontes' de novos vírus com pote… [+14409 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Canaltech.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Natalie Rosa\",\n" +
            "            \"title\": \"Como a tecnologia corrigiu um erro e mudou o que sabíamos sobre este dinossauro - Canaltech\",\n" +
            "            \"description\": \"Cientistas acreditavam que determinada pegada era de um dinossauro grande e carnívoro. Agora, com a tecnologia atual, descobriram que era menor e herbívoro\",\n" +
            "            \"url\": \"https://canaltech.com.br/ciencia/como-a-tecnologia-corrigiu-um-erro-e-mudou-o-que-sabiamos-sobre-este-dinossauro-199687/\",\n" +
            "            \"urlToImage\": \"https://t.ctcdn.com.br/LtUU6sgTdFOLa-flV25WabFBNNU=/1400x788/smart/i521220.png\",\n" +
            "            \"publishedAt\": \"2021-10-24T17:30:00Z\",\n" +
            "            \"content\": \"Há mais de 60 anos, na década de 1960, paleontólogos analisaram pegadas encontradas por mineiros de carvão australianos. As marcas, que mediam mais de 30 centímetros de comprimento, fizeram os paleon… [+1786 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Metsul.com\"\n" +
            "            },\n" +
            "            \"author\": \"Estael Sias\",\n" +
            "            \"title\": \"Ciclone bomba na costa Oeste dos Estados Unidos pode ter força recorde - MetSul Meteorologia\",\n" +
            "            \"description\": \"National Weather Service mostra que jamais foi observado ciclone tão intenso na costa Noroeste dos Estados Unidos em ciclogênese explosiva.\",\n" +
            "            \"url\": \"https://metsul.com/ciclone-bomba-na-costa-oeste-dos-estados-unidos-pode-ter-forca-recorde/\",\n" +
            "            \"urlToImage\": \"https://metsul.com/wp-content/uploads/2021/10/F5841E31-6605-46A3-A90F-9EA6A1F0A9B9.jpeg\",\n" +
            "            \"publishedAt\": \"2021-10-24T17:25:56Z\",\n" +
            "            \"content\": \"Ciclone bomba na costa do Noroeste dos Estados Unidos às 14h deste domingo (hora de Brasília) | Zoom Earth\\r\\nO ciclone bomba que se formou na costa do Noroeste dos Estados Unidos com uma ciclogênese e… [+4962 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Istoedinheiro.com.br\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"'Celular é a heroína do século 21', diz psicólogo sobre vício em tecnologia - IstoÉ Dinheiro\",\n" +
            "            \"description\": null,\n" +
            "            \"url\": \"https://www.istoedinheiro.com.br/celular-e-a-heroina-do-seculo-21-diz-psicologo-sobre-vicio-em-tecnologia/\",\n" +
            "            \"urlToImage\": \"https://www.istoedinheiro.com.br/wp-content/uploads/sites/17/2021/10/girl-gb1290ba62-640-e1635088136124.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T17:15:00Z\",\n" +
            "            \"content\": \"O psicólogo espanhol Marc Masip, uma das referências em estudos sobre como a tecnologia altera nossos padrões mentais, acredita que não existem muitas diferenças entre a abstinência causada pela falt… [+2040 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Em.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Paloma Oliveto - Correio Braziliense\",\n" +
            "            \"title\": \"Segunda geração de vacinas busca aumento de eficácia e duração da proteção - Estado de Minas\",\n" +
            "            \"description\": \"Imunizantes estão sendo testados por cientistas de vários países; expectativa é de que protocolos aumentem a eficácia e duração da proteção conferida\",\n" +
            "            \"url\": \"https://www.em.com.br/app/noticia/ciencia/2021/10/24/interna_ciencia,1316618/segunda-geracao-de-vacinas-busca-aumento-de-eficacia-e-duracao-da-protecao.shtml\",\n" +
            "            \"urlToImage\": \"https://i.em.com.br/dI_KiH8PS1hDVibSB0xq4xbPcqM=/600x315/smart/imgsapp.em.com.br/app/noticia_127983242361/2021/10/24/1316618/37-da-populacao-do-mundo-ja-recebeu-ao-menos-uma-dose-da-vacina-contra-a-covid-19_0.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T16:10:00Z\",\n" +
            "            \"content\": \"Aproveite o melhor do Estado de Minas: contedos exclusivos, colunistas renomados e muitos benefcios para voc.\\r\\nASSINE AGORAUtilizamos tecnologia e segurana do Google para fazer a assinatura.\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Uol.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Luciana Constantino\",\n" +
            "            \"title\": \"Bactéria ‘rouba’ zinco e ferro de hospedeiro para aumentar virulência - VivaBem\",\n" +
            "            \"description\": \"Pesquisadores da Universidade de São Paulo (USP) desvendaram a estratégia usada pela bactéria Chromobacterium violaceum para roubar metais como zinco e ferro do organismo hospedeiro e aumentar, assim, sua virulência. A descoberta pode dar pistas para a bu\",\n" +
            "            \"url\": \"https://www.uol.com.br/vivabem/noticias/redacao/2021/10/24/bacteria-rouba-zinco-e-ferro-de-hospedeiro-para-aumentar-virulencia.htm\",\n" +
            "            \"urlToImage\": \"https://conteudo.imguol.com.br/c/entretenimento/5f/2021/10/24/bacteria-reportagem-fapesp-1635084692173_v2_615x300.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T14:13:21Z\",\n" +
            "            \"content\": \"Pesquisadores da Universidade de São Paulo (USP) desvendaram a estratégia usada pela bactéria Chromobacterium violaceum para roubar metais como zinco e ferro do organismo hospedeiro e aumentar, assim… [+4772 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Diarionline.com.br\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Domingo começa chuvoso e temperatura de 21ºC em Corumbá - Diário Corumbaense\",\n" +
            "            \"description\": null,\n" +
            "            \"url\": \"https://www.diarionline.com.br/?s=noticia&id=127659\",\n" +
            "            \"urlToImage\": \"/static/arquivo/2021-10/dcmarca_chuva-5003.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T12:43:31Z\",\n" +
            "            \"content\": \"Anderson Gallo/Diário Corumbaense\\r\\nVentania na noite de sábado, em Corumbá\\r\\nCom alerta vermelho para tempestade em 63 municípios de Mato Grosso do Sul, incluindo Corumbá, os ventos e chuva registrado… [+898 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"google-news\",\n" +
            "                \"name\": \"Google News\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Nasa adia lançamento de missão lunar para 2022 - Poder360\",\n" +
            "            \"description\": null,\n" +
            "            \"url\": \"https://news.google.com/__i/rss/rd/articles/CBMiWWh0dHBzOi8vd3d3LnBvZGVyMzYwLmNvbS5ici9pbnRlcm5hY2lvbmFsL25hc2EtYWRpYS1sYW5jYW1lbnRvLWRlLW1pc3Nhby1sdW5hci1wYXJhLTIwMjIv0gEA?oc=5\",\n" +
            "            \"urlToImage\": null,\n" +
            "            \"publishedAt\": \"2021-10-24T11:38:39Z\",\n" +
            "            \"content\": null\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Correio24horas.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Thais Borges\",\n" +
            "            \"title\": \"Entenda o que é a fuga de cérebros e por que perder cientistas é um problema para o Brasil - Jornal Correio\",\n" +
            "            \"description\": \"Com a falta de investimentos em ciência, cada vez mais pesquisadores decidem deixar o país\",\n" +
            "            \"url\": \"https://www.correio24horas.com.br/noticia/nid/entenda-o-que-e-a-fuga-de-cerebros-e-por-que-perder-cientistas-e-um-problema-para-o-brasil/\",\n" +
            "            \"urlToImage\": \"https://www.correio24horas.com.br/fileadmin/_processed_/4/7/csm_WhatsApp_Image_2021-10-21_at_19.53.40_bc2b7470cd.jpeg\",\n" +
            "            \"publishedAt\": \"2021-10-24T10:00:00Z\",\n" +
            "            \"content\": null\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"globo\",\n" +
            "                \"name\": \"Globo\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Você se distrai com facilidade? Segundo a ciência, estes três hábitos podem te ajudar - Pequenas Empresas & Grandes Negócios\",\n" +
            "            \"description\": \"Falta de foco pode atrapalhar a rotina e comprometer metas e relacionamentos; veja como evitar o problema\",\n" +
            "            \"url\": \"https://revistapegn.globo.com/Dia-a-dia/noticia/2021/10/voce-se-distrai-com-facilidade-segundo-ciencia-estes-tres-habitos-podem-te-ajudar.html\",\n" +
            "            \"urlToImage\": \"https://s2.glbimg.com/3Q_wtnzYQ4q3Fi6kWYHLSUwuxPU=/512x320/smart/e.glbimg.com/og/ed/f/original/2020/10/23/pexels-andrea-piacquadio-3755755.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T09:13:14Z\",\n" +
            "            \"content\": \"A falta de foco pode atrapalhar muito a rotina e comprometer metas e relacionamentos (Foto: Andrea Piacquadio / Pexels)\\r\\nVocê já pegou o celular para fazer algo específico e acabou se distraindo e es… [+2625 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"google-news\",\n" +
            "                \"name\": \"Google News\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"COP26 não deve ter acordo sobre mercado de carbono, diz vice do IPCC - Poder360\",\n" +
            "            \"description\": null,\n" +
            "            \"url\": \"https://news.google.com/__i/rss/rd/articles/CBMib2h0dHBzOi8vd3d3LnBvZGVyMzYwLmNvbS5ici9tZWlvLWFtYmllbnRlL2NvcC0yNi1uYW8tZGV2ZS10ZXItYWNvcmRvLXNvYnJlLW1lcmNhZG8tZGUtY2FyYm9uby1kaXotdmljZS1kby1pcGNjL9IBAA?oc=5\",\n" +
            "            \"urlToImage\": null,\n" +
            "            \"publishedAt\": \"2021-10-24T09:00:29Z\",\n" +
            "            \"content\": null\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Omunicipio.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Ciro Groh\",\n" +
            "            \"title\": \"Tempo: o que esperar da previsão neste domingo para Brusque e Vale do Itajaí - O Município\",\n" +
            "            \"description\": \"\",\n" +
            "            \"url\": \"https://omunicipio.com.br/ciro-groh-tempo-o-que-esperar-da-previsao-neste-domingo-para-brusque-e-vale-do-itajai-3/\",\n" +
            "            \"urlToImage\": \"https://omunicipio.com.br/wp-content/uploads/2021/10/ciro-groh-tempo-o-que-esperar-da-previsao-neste-domingo-para-brusque-e-vale-do-itajai-3-capa.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T08:48:58Z\",\n" +
            "            \"content\": \"Domingo começando na presença de muitas nuvens sobre Brusque/Arquivo: Ciro Groh\\r\\nO transcorrer da madrugada deste domingo, 24, foi de tempo seco em todo o Vale do Itajaí-Mirim, isso depois da chuva r… [+2988 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"google-news\",\n" +
            "                \"name\": \"Google News\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Como os humanos perderam suas caudas - Internacional Estadão\",\n" +
            "            \"description\": null,\n" +
            "            \"url\": \"https://news.google.com/__i/rss/rd/articles/CBMiX2h0dHBzOi8vaW50ZXJuYWNpb25hbC5lc3RhZGFvLmNvbS5ici9ub3RpY2lhcy9ueXRpdyxjaWVuY2lhLWNhdWRhcy1odW1hbm9zLWdlbmV0aWNhLDcwMDAzODc1ODI30gFjaHR0cHM6Ly9pbnRlcm5hY2lvbmFsLmVzdGFkYW8uY29tLmJyL25vdGljaWFzL255dGl3LGNpZW5jaWEtY2F1ZGFzLWh1bWFub3MtZ2VuZXRpY2EsNzAwMDM4NzU4MjcuYW1w?oc=5\",\n" +
            "            \"urlToImage\": null,\n" +
            "            \"publishedAt\": \"2021-10-24T08:00:00Z\",\n" +
            "            \"content\": null\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"google-news\",\n" +
            "                \"name\": \"Google News\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Os anéis de Saturno são como um sismômetro que revela o núcleo do planeta - Internacional Estadão\",\n" +
            "            \"description\": null,\n" +
            "            \"url\": \"https://news.google.com/__i/rss/rd/articles/CBMibmh0dHBzOi8vaW50ZXJuYWNpb25hbC5lc3RhZGFvLmNvbS5ici9ub3RpY2lhcy9ueXRpdyxhbmVpcy1zYXR1cm5vLXNpc21vbWV0cm8tcmV2ZWxhLW51Y2xlby1wbGFuZXRhLDcwMDAzODc3MTk30gFyaHR0cHM6Ly9pbnRlcm5hY2lvbmFsLmVzdGFkYW8uY29tLmJyL25vdGljaWFzL255dGl3LGFuZWlzLXNhdHVybm8tc2lzbW9tZXRyby1yZXZlbGEtbnVjbGVvLXBsYW5ldGEsNzAwMDM4NzcxOTcuYW1w?oc=5\",\n" +
            "            \"urlToImage\": null,\n" +
            "            \"publishedAt\": \"2021-10-24T08:00:00Z\",\n" +
            "            \"content\": null\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Uol.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Marcos Bonfim\",\n" +
            "            \"title\": \"Eugenia? Estudo com DNA de autistas é alerta para os limites da ciência - Tilt\",\n" +
            "            \"description\": \"Um amplo levantamento iniciado no Reino Unidos para coleta de DNA de pessoas diagnosticadas com espectro autista foi interrompido no fim de setembro. Segundo os grupos contrários ao estudo, não houve consultas sobre o desenvolvimento e o impacto da pesqui\",\n" +
            "            \"url\": \"https://www.uol.com.br/tilt/noticias/redacao/2021/10/24/estudo-com-dna-de-pessoas-em-espectro-autista-e-interrompido-no-reino-unido.htm\",\n" +
            "            \"urlToImage\": \"https://conteudo.imguol.com.br/c/entretenimento/db/2021/04/15/simbolo-do-autismo-1618509099120_v2_615x300.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T07:02:20Z\",\n" +
            "            \"content\": \"Um amplo levantamento iniciado no Reino Unidos para coleta de DNA de pessoas diagnosticadas com espectro autista foi interrompido no fim de setembro. Segundo os grupos contrários ao estudo, não houve… [+4318 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Mrnews.com.br\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"TESTE PSICOLÓGICO: O QUE VOCÊ VIU NA IMAGEM PRIMEIRO? ISTO DIRÁ TUDO SOBRE SEU ESTADO DE ESPÍRITO AGORA! - MRNews Futebol ao Vivo, Jogos de Hoje e  Notícias\",\n" +
            "            \"description\": \"Mais um teste do Mrnews para seus leitores. Será que o teste dirá sobre seu estado de espírito atual? Confira então a seguir e veja se você se encaixa. Estes testes psicológicos sempre fazem muito sucessos aqui no site MRNews e nos sites do nosso grupo: Caros…\",\n" +
            "            \"url\": \"https://mrnews.com.br/index.php/2021/10/23/teste-psicologico-o-que-voce-viu-na-imagem-primeiro-isto-dira-tudo-sobre-seu-estado-de-espirito-agora/\",\n" +
            "            \"urlToImage\": \"https://mrnews.com.br/wp-content/uploads/2021/10/pilares-ou-figuras.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-23T23:56:30Z\",\n" +
            "            \"content\": \"Mais um teste do Mrnews para seus leitores. Será que o teste dirá sobre seu estado de espírito atual?\\r\\nConfira então a seguir e veja se você se encaixa.\\r\\nEstes testes psicológicos sempre fazem muito … [+1332 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Canaltech.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Daniele Cavalcante\",\n" +
            "            \"title\": \"O céu não é o limite | Nova força da natureza, asteroide perto da Terra e mais! - Canaltech\",\n" +
            "            \"description\": \"Confira as principais notícias do espaço da semana 16 a 22 de outubro de 2021 e fique por dentro de tudo o que mais importa no universo da astronomia!\",\n" +
            "            \"url\": \"https://canaltech.com.br/ciencia/o-ceu-nao-e-o-limite-nova-forca-da-natureza-asteroide-perto-da-terra-e-mais-199692/\",\n" +
            "            \"urlToImage\": \"https://t.ctcdn.com.br/5CQpiULa3I7BR4DZ99pXkHrcsFw=/1000x563/smart/i521232.png\",\n" +
            "            \"publishedAt\": \"2021-10-23T23:00:00Z\",\n" +
            "            \"content\": \"Uma nova força fundamental estaria prestes a ser descoberta? Ainda é muito cedo para dizer, mas cientistas suspeitam que, talvez, algo estranho esteja mesmo acontecendo com as partículas conhecidas c… [+7850 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Metsul.com\"\n" +
            "            },\n" +
            "            \"author\": \"MetSul.com\",\n" +
            "            \"title\": \"Ciclone bomba no Pacífico traz emergência no mar e outro pior se forma - MetSul Meteorologia\",\n" +
            "            \"description\": \"Segundo ciclone bomba vai atingir o Oeste dos Estados Unidos e do Canadá em apenas dois dias em meio a uma emergência em mar aberto.\",\n" +
            "            \"url\": \"https://metsul.com/ciclone-bomba-no-pacifico-traz-emergencia-no-mar-e-outro-mais-intenso-se-formara/\",\n" +
            "            \"urlToImage\": \"https://metsul.com/wp-content/uploads/2021/10/84C4D0A2-8EBB-483E-B98B-B1F801C92D51-1024x576.png\",\n" +
            "            \"publishedAt\": \"2021-10-23T22:15:12Z\",\n" +
            "            \"content\": \"Ciclone bomba no Pacífico, na costa do Noroeste dos Estados Unidos e da província canadense de British Columbia, provocou condições de mar muito grosso que traz situação de emergência em mar aberto q… [+3704 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"BBC News\"\n" +
            "            },\n" +
            "            \"author\": \"https://www.facebook.com/bbcnews\",\n" +
            "            \"title\": \"A outra grande obra de Charles Darwin que poucos conhecem (e não é sobre a evolução) - BBC News Brasil\",\n" +
            "            \"description\": \"Naturalista e biólogo britânico é conhecido até hoje por clássicos científicos como \\\"A Origem das Espécies\\\" e \\\"A Origem do Homem e a Seleção Sexual\\\", mas outro livro, sobre emoções e quase não publicado, continua a gerar polêmica.\",\n" +
            "            \"url\": \"https://www.bbc.com/portuguese/geral-58953568\",\n" +
            "            \"urlToImage\": \"https://ichef.bbci.co.uk/news/1024/branded_portuguese/17369/production/_120718059_default-2-2.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-23T22:00:06Z\",\n" +
            "            \"content\": \"<ul><li>Dalia Ventura</li><li>Da BBC News Mundo</li></ul>\\r\\nCrédito, Wellcome Collection\\r\\nLegenda da foto, Charles Darwin é conhecido até hoje por clássicos científicos como \\\"A Origem das Espécies\\\" e … [+10881 chars]\"\n" +
            "        }\n" +
            "    ]\n" +
            "}";

    private static String categoria_esportes = "{\n" +
            "    \"status\": \"ok\",\n" +
            "    \"totalResults\": 70,\n" +
            "    \"articles\": [\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"globo\",\n" +
            "                \"name\": \"Globo\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Mourinho é expulso, mas Roma segura líder Napoli e acaba com sequência de vitórias do rival - globoesporte.com\",\n" +
            "            \"description\": \"Luciano Spaletti, treinador da equipe napolitana, também recebe cartão vermelho após o empate de 0 a 0 no estádio Olímpico\",\n" +
            "            \"url\": \"https://ge.globo.com/futebol/futebol-internacional/futebol-italiano/noticia/mourinho-e-expulso-mas-roma-segura-lider-napoli-e-acaba-com-sequencia-de-vitorias-do-rival.ghtml\",\n" +
            "            \"urlToImage\": \"https://s2.glbimg.com/J0S-xh0PLiOAsUOKtVX8cs174sE=/1200x/smart/filters:cover():strip_icc()/i.s3.glbimg.com/v1/AUTH_bc8228b6673f488aa253bbcb03c80ec5/internal_photos/bs/2021/k/f/y2w63kRzKGUW2uJXb10g/2021-10-24t171557z-1331700693-up1ehao1byjyr-rtrmadp-3-soccer-italy-rom-nap-report.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T18:57:57Z\",\n" +
            "            \"content\": \"Em duelo válido pela nona rodada do Campeonato Italiano, Roma e Napoli ficaram no 0 a 0 neste domingo, no estádio Olímpico da capital. Técnico dos donos da casa, o português José Mourinho foi expulso… [+1037 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"globo\",\n" +
            "                \"name\": \"Globo\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Bragantino decide escalar Helinho e vai pagar multa ao São Paulo - globoesporte.com\",\n" +
            "            \"description\": \"Clube tem até 30 dias para efetuar o pagamento de R$ 400 mil ao Tricolor\",\n" +
            "            \"url\": \"https://ge.globo.com/sp/vale-do-paraiba-regiao/futebol/noticia/bragantino-decide-escalar-helinho-e-vai-pagar-multa-ao-sao-paulo.ghtml\",\n" +
            "            \"urlToImage\": \"https://s2.glbimg.com/XnMHEDAmOLHomaTqhf4ghjdSAiY=/1200x/smart/filters:cover():strip_icc()/s04.video.glbimg.com/x720/9956511.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T18:36:41Z\",\n" +
            "            \"content\": \"O Red Bull Bragantino pagará R$ 400 mil ao São Paulo para poder utilizar o atacante Helinho na partida contra o Tricolor, neste domingo, às 18h15, em Bragança Paulista, pelo Campeonato Brasileiro. O … [+738 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Itatiaia.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Rádio Itatiaia - A Rádio de Minas\",\n" +
            "            \"title\": \"Atlético x Cuiabá: clique e acompanhe ao vivo o jogo pelo Campeonato Brasileiro - Rádio Itatiaia\",\n" +
            "            \"description\": \"Após a goleada por 4 a 0 diante do Fortaleza, pelo jogo de ida da Copa do Brasil, o Atlético agora terá mais um...\",\n" +
            "            \"url\": \"https://www.itatiaia.com.br/noticia/atletico-x-cuiaba-clique-e-acompanhe-ao-vivo-o-jogo-pelo-campeonato-brasileiro\",\n" +
            "            \"urlToImage\": \"https://www.itatiaia.com.br/admin/Conteudo/noticias/182113/744x500/jogo-44424-10-2021_1.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T18:21:00Z\",\n" +
            "            \"content\": \"Foto: Pedro Souza/Atlético\\r\\nKeno em disputa de bola com os jogadores do Cuiabá\\r\\nApós a goleada por 4 a 0 diante do Fortaleza, pelo jogo de ida da Copa do Brasil, o Atlético agora terá mais uma “decis… [+1550 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Uol.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Marinho Saldanha\",\n" +
            "            \"title\": \"Aguirre confirma mudanças na zaga do Inter para pegar o Corinthians - UOL Esporte\",\n" +
            "            \"description\": \"Diego Aguirre não apresentou surpresas na escalação do Inter. Hoje (24), treinador só fez alterações inevitáveis. Na zaga, as ausências de Saravia e Bruno Méndez geram as principais mudanças.Méndez não poderia atuar pois pertence ao Corinthians. Ele ainda\",\n" +
            "            \"url\": \"https://www.uol.com.br/esporte/futebol/ultimas-noticias/2021/10/24/aguirre-confirma-mudancas-na-zaga-do-inter-para-pegar-o-corinthians.htm\",\n" +
            "            \"urlToImage\": \"https://conteudo.imguol.com.br/c/esporte/73/2021/08/22/gabriel-mercado-comemora-gol-marcado-pelo-internacional-contra-o-santos-1629670092848_v2_615x300.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T17:59:27Z\",\n" +
            "            \"content\": \"Diego Aguirre não apresentou surpresas na escalação do Inter. Hoje (24), treinador só fez alterações inevitáveis. Na zaga, as ausências de Saravia e Bruno Méndez geram as principais mudanças.\\r\\nMéndez… [+748 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"globo\",\n" +
            "                \"name\": \"Globo\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Torcidas de Náutico e Vasco fazem festa antes de partida nos Aflitos; veja vídeos - globoesporte.com\",\n" +
            "            \"description\": \"Alvirrubros aglomeraram na avenida Rosa e Silva para recepcionar atletas, e vascaínos, em menor número, puxaram gritos de incentivo; partida é às 16h, pela Série B\",\n" +
            "            \"url\": \"https://ge.globo.com/pe/futebol/times/nautico/noticia/torcidas-de-nautico-e-vasco-fazem-festa-antes-de-partida-nos-aflitos-video.ghtml\",\n" +
            "            \"urlToImage\": \"https://s2.glbimg.com/9i4DCR2SffLmCMZChFAWWeKnNQw=/1200x/smart/filters:cover():strip_icc()/i.s3.glbimg.com/v1/AUTH_bc8228b6673f488aa253bbcb03c80ec5/internal_photos/bs/2021/I/A/iWNabTR8uXUXwjcXRx1A/whatsapp-image-2021-10-24-at-14.29.42.jpeg\",\n" +
            "            \"publishedAt\": \"2021-10-24T17:54:43Z\",\n" +
            "            \"content\": \"As torcidas de Náutico e Vasco fizeram festa antes da partida da 16h deste domingo entre as equipes, no estádio dos Aflitos. Os recifenses fizeram uma \\\"avenida alvirrubra\\\" na chegada do ônibus da del… [+1213 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Torcedores.com\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Mecenas do Atlético-MG defende criação da liga e manda recado ao Flamengo - Torcedores.com\",\n" +
            "            \"description\": \"Principal patrocinador do Atlético-MG e membro de um órgão colegiado que administra o Galo, Rubens Menin é favorável a criação de uma liga no\",\n" +
            "            \"url\": \"https://www.torcedores.com/noticias/2021/10/mecenas-do-atletico-mg-defende-criacao-da-liga-e-manda-recado-ao-flamengo\",\n" +
            "            \"urlToImage\": \"https://static-wp-tor15-prd.torcedores.com/wp-content/uploads/2021/10/atletico-mg-menin.png\",\n" +
            "            \"publishedAt\": \"2021-10-24T17:22:00Z\",\n" +
            "            \"content\": \"Crédito: Divulgacao/Atlético\\r\\nPrincipal patrocinador do Atlético-MG e membro de um órgão colegiado que administra o Galo, Rubens Menin é favorável a criação de uma liga no futebol brasileiro. Na sua … [+1642 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"globo\",\n" +
            "                \"name\": \"Globo\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Vettori embolsa US$ 50 mil por performance contra Borrachinha, e Robocop também é premiado - globoesporte.com\",\n" +
            "            \"description\": \"No fim de semana, italiano soma bolsa da luta, bônus de vitória, 20% da bolsa do brasileiro e o bônus de performance. Brasileiro Gregory Robocop e Jun Yong Park levam \\\"luta da noite\\\"\",\n" +
            "            \"url\": \"https://ge.globo.com/combate/noticia/vettori-embolsa-us-50-mil-por-performance-contra-borrachinha-e-robocop-tambem-e-premiado.ghtml\",\n" +
            "            \"urlToImage\": \"https://s2.glbimg.com/EEdcUpbss9rd9KpMB_L3XfvqMso=/1200x/smart/filters:cover():strip_icc()/i.s3.glbimg.com/v1/AUTH_bc8228b6673f488aa253bbcb03c80ec5/internal_photos/bs/2021/3/6/CRN75PQSeVdVOoVtNqGg/gettyimages-1348311255.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T17:15:05Z\",\n" +
            "            \"content\": \"Marvin Vettori fez um bom dinheiro nesse fim de semana. Além da própria bolsa para entrar em ação no UFC, ele ficou com 20% da bolsa de Paulo Borrachinha depois que o brasileiro teve problemas com o … [+2207 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"globo\",\n" +
            "                \"name\": \"Globo\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Camisas usadas no Fla-Flu vão a leilão; peças de John Kennedy e Renê recebem maiores lances - globoesporte.com\",\n" +
            "            \"description\": \"Torcedores e colecionadores poderão fazer ofertas durante três semanas. Todas as camisas será desinfetada com tratamento de luz UV-C por medida de segurança\",\n" +
            "            \"url\": \"https://ge.globo.com/futebol/times/fluminense/noticia/camisas-usadas-no-fla-flu-vao-a-leilao-pecas-de-john-kennedy-e-rene-recebem-maiores-lances.ghtml\",\n" +
            "            \"urlToImage\": \"https://s2.glbimg.com/8DO4kXmj5yjUVa362gkGDrdrZL8=/1200x/smart/filters:cover():strip_icc()/i.s3.glbimg.com/v1/AUTH_bc8228b6673f488aa253bbcb03c80ec5/internal_photos/bs/2021/s/T/on71CkRlyEoTfXCgrl5w/fluaaa.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T17:11:05Z\",\n" +
            "            \"content\": \"Esta é para torcedores e colecionadores: as camisas utilizadas pelos jogadores de Fluminense e Flamengo no jogo deste sábado, no Maracanã, foram colocadas em leilão no site especializado MatchWornShi… [+1555 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"globo\",\n" +
            "                \"name\": \"Globo\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Antony marca, e líder Ajax massacra o PSV em clássico do Campeonato Holandês - globoesporte.com\",\n" +
            "            \"description\": \"Outro ex-jogador do São Paulo, David Neres entra no segundo tempo da partida realizada em Amsterdã; André Ramalho e Carlos Vinicius são titulares no time de Eindhoven\",\n" +
            "            \"url\": \"https://ge.globo.com/futebol/futebol-internacional/noticia/antony-marca-e-lider-ajax-massacra-o-psv-em-classico-do-campeonato-holandes.ghtml\",\n" +
            "            \"urlToImage\": \"https://s2.glbimg.com/pub3FsD9YvKWyb9Qi_cnqaT-LOw=/1200x/smart/filters:cover():strip_icc()/i.s3.glbimg.com/v1/AUTH_bc8228b6673f488aa253bbcb03c80ec5/internal_photos/bs/2021/j/F/IHqf6KRK2UDCtEptoBtg/gettyimages-1236100866.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T17:05:01Z\",\n" +
            "            \"content\": \"Depois de golear o Borussia Dortmund no meio de semana, o Ajax voltou a balançar as redes em quantidade neste domingo. Jogando em casa, o time de Amsterdã fez 5 a 0 no PSV em clássico válido pela 10ª… [+1014 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"globo\",\n" +
            "                \"name\": \"Globo\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Rebeca Andrade traça nova meta: levar equipe do Brasil às Olimpíadas - globoesporte.com\",\n" +
            "            \"description\": \"Ginasta vê saldo positivo no Mundial de Kitakyushu e faz planos rumo a 2024: \\\"Quero muito mesmo estar em Paris junto com a equipe\\\"\",\n" +
            "            \"url\": \"https://ge.globo.com/ginastica-artistica/mundial-de-ginastica-artistica/noticia/rebeca-andrade-traca-nova-meta-levar-equipe-do-brasil-as-olimpiadas.ghtml\",\n" +
            "            \"urlToImage\": \"https://s2.glbimg.com/dTEVMaLR4auIbq6NOOOvjt3MD4A=/1200x/smart/filters:cover():strip_icc()/i.s3.glbimg.com/v1/AUTH_bc8228b6673f488aa253bbcb03c80ec5/internal_photos/bs/2021/Q/L/CffywlT6SLFQhQ7URgTg/2021-10-23t123713z-112113867-up1ehan0z1zd2-rtrmadp-3-gymnastics-world.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T17:03:26Z\",\n" +
            "            \"content\": \"Depois de conquistar um ouro e uma prata no Mundial de ginástica artística de Kitakyushu, Rebeca Andrade fechou a temporada 2021 e agora quer curtir as merecidas férias. A ginasta de 22 anos, porém, … [+2909 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Espn.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"ESPN.com.br\",\n" +
            "            \"title\": \"Ex-Corinthians, Sornoza leva entrada criminosa, sofre concussão cerebral e tem até perda de memória - ESPN.com.br\",\n" +
            "            \"description\": \"Meio-campista pertence ao clube paulista, mas está emprestado ao Independiente Del Valle\",\n" +
            "            \"url\": \"https://www.espn.com.br/futebol/artigo/_/id/9411882/ex-corinthians-sornoza-entrada-criminosa-sofre-concussao-cerebral-tem-perda-memoria\",\n" +
            "            \"urlToImage\": \"https://a1.espncdn.com/combiner/i?img=%2Fphoto%2F2021%2F1024%2Fr927784_1296x729_16%2D9.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T16:51:59Z\",\n" +
            "            \"content\": \"O meio-campista Junior Sornoza sofreu uma entrada criminosa na partida do Independiente del Valle contra a LDU neste sábado (23) pelo Campeonato Equatoriano.No lance, o jogador que está emprestado pe… [+871 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Opovo.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"O Povo\",\n" +
            "            \"title\": \"Tiago Nunes reconhece insatisfação da torcida do Ceará e diz que campanha do Fortaleza atrapalha - O POVO\",\n" +
            "            \"description\": \"Treinador pondera que desempenho do arquirrival Tricolor em 2021 aumenta cobrança sobre o rendimento do Vovô no Brasileirão, mas admite: \\\"Temos muito o que evoluir\\\"\",\n" +
            "            \"url\": \"https://www.opovo.com.br/esportes/futebol/times/ceara/2021/10/24/tiago-nunes-reconhece-insatisfacao-da-torcida-do-ceara-e-diz-que-campanha-do-fortaleza-atrapalha.html\",\n" +
            "            \"urlToImage\": \"https://www.opovo.com.br/_midias/jpg/2021/10/24/818x460/1_51524350032_7c6e2f7cff_o-17336629.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T16:42:12Z\",\n" +
            "            \"content\": \"Em entrevista coletiva depois do empate sem gols com o Juventude-RS, no último sábado, 23, no estádio Alfredo Jaconi, em Caxias do Sul, pela 28ª rodada da Série A, o técnico Tiago Nunes admitiu que o… [+2585 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Espn.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"ESPN.com.br\",\n" +
            "            \"title\": \"Barcelona x Real Madrid: Jornal espanhol exalta partidaça de Vinicius Jr.: 'Koeman teve que tirar Mingueza porque estava dando pena' - ESPN.com.br\",\n" +
            "            \"description\": \"Atacante brasileiro foi o grande destaque da vitória por 2 a 1 do Real Madrid sobre o Barcelona\",\n" +
            "            \"url\": \"https://www.espn.com.br/futebol/artigo/_/id/9411635/barcelona-x-real-madrid-jornal-espanhol-exalta-partidaca-vinicius-jr-koeman-teve-tirar-mingueza-porque-estava-dando-pena\",\n" +
            "            \"urlToImage\": \"https://a2.espncdn.com/combiner/i?img=%2Fphoto%2F2021%2F1024%2Fr927721_911x512_16%2D9.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T16:39:12Z\",\n" +
            "            \"content\": \"Vinicius Jr. foi o grande destaque do Real Madrid na vitória por 2 a 1 sobre o Barcelona, neste domingo, por LaLiga\\r\\nApós a vitória por 2 a 1 do Real Madrid sobre o Barcelona, o jornal Marca enlouque… [+1596 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"globo\",\n" +
            "                \"name\": \"Globo\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Inter busca \\\"empate relâmpago\\\" após levar 3 a 1 do Palmeiras e vai à semi do Brasileirão sub-20 - globoesporte.com\",\n" +
            "            \"description\": \"Após vencer a ida em casa, Colorado buscou o 3 a 3 no Allianz Parque e se classificou\",\n" +
            "            \"url\": \"https://ge.globo.com/futebol/brasileirao-sub-20/noticia/inter-busca-empate-relampago-apos-levar-3-a-1-do-palmeiras-e-vai-a-semi-do-brasileirao-sub-20.ghtml\",\n" +
            "            \"urlToImage\": \"https://s2.glbimg.com/EowTwy-DYyAAk8PnLdSFo3SN7V0=/1200x/smart/filters:cover():strip_icc()/i.s3.glbimg.com/v1/AUTH_bc8228b6673f488aa253bbcb03c80ec5/internal_photos/bs/2021/c/A/rnCh2HToqwZ0fS3QGWZA/inter.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T15:57:34Z\",\n" +
            "            \"content\": \"O Internacional garantiu neste domingo a classificação para a semifinal do Campeonato Brasileiro sub-20. Depois de vencer o Palmeiras na ida por 2 a 1, o Colorado mostrou poder de reação e empatou em… [+796 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"globo\",\n" +
            "                \"name\": \"Globo\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Vídeos do UFC: Massaranduba, Tabatha e Robocop vencem, e Borrachinha perde nos pontos - globoesporte.com\",\n" +
            "            \"description\": \"Melhores momentos do UFC deste último sábado têm também as derrotas de Livinha Souza, Daniel Miojo e Maria Oliveira, além dos triunfos de Jai Herbert, Negumereanu e Alex Caceres\",\n" +
            "            \"url\": \"https://ge.globo.com/combate/noticia/videos-do-ufc-massaranduba-tabatha-e-robocop-vencem-e-borrachinha-perde-nos-pontos.ghtml\",\n" +
            "            \"urlToImage\": \"https://s2.glbimg.com/-kzVMmCSErlEHXtHs3trUi2nChE=/1200x/smart/filters:cover():strip_icc()/i.s3.glbimg.com/v1/AUTH_bc8228b6673f488aa253bbcb03c80ec5/internal_photos/bs/2021/Q/x/snNAaYRyukBX0yfBC5VA/gettyimages-1348290366.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T15:50:05Z\",\n" +
            "            \"content\": \"O UFC deste último sábado foi agitado, principalmente por conta da presença de sete brasileiros em ação em Las Vegas. Desses, três saíram com o braço erguido e outros quatro acabaram derrotados. Nos … [+2726 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Verdesmares.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Redação\",\n" +
            "            \"title\": \"Olympique de Marselha X PSG ao vivo pelo Campeonato Francês - Jogada - Diário do Nordeste\",\n" +
            "            \"description\": \"Com o retorno de Neymar, o Paris Saint-Germain prepara a volta do famoso trio com Messi e Mbappé para o clássico deste domingo, às 15h45, em Marselha, contra o Olympique. <\",\n" +
            "            \"url\": \"https://diariodonordeste.verdesmares.com.br/jogada/olympique-de-marselha-x-psg-veja-onde-assistir-palpites-e-provaveis-escalacoes-1.3151658\",\n" +
            "            \"urlToImage\": \"https://diariodonordeste.verdesmares.com.br/image/contentid/policy:1.3151661:1635083837/image.jpg?h=630&q=0.6&w=1200&$p$h$q$w=f76cc5e\",\n" +
            "            \"publishedAt\": \"2021-10-24T15:45:26Z\",\n" +
            "            \"content\": \"Com o retorno de Neymar, o Paris Saint-Germain prepara a volta do famoso trio com Messi e Mbappé para o clássico deste domingo, às 15h45, em Marselha, contra o Olympique.\\r\\nAcompanhe ao vivo\\r\\nLíder di… [+720 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"globo\",\n" +
            "                \"name\": \"Globo\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Em jogo com pancadaria no fim, Fluminense vence Boavista e segue 100% no Carioca Feminino - globoesporte.com\",\n" +
            "            \"description\": \"Com gols de  Michelle Brito e Ronaldinha, \\\"Guerreiras de Fluzão\\\" vencem por 2 a 0 e ocupam vice-liderança da competição. Partida teve quatro jogadoras expulsas\",\n" +
            "            \"url\": \"https://ge.globo.com/futebol/times/fluminense/noticia/em-jogo-com-pancadaria-no-fim-fluminense-vence-boavista-e-segue-100percent-no-carioca-feminino.ghtml\",\n" +
            "            \"urlToImage\": \"https://s2.glbimg.com/hp_vUmJZLsSNjS5yFvdpBYH9QCU=/1200x/smart/filters:cover():strip_icc()/i.s3.glbimg.com/v1/AUTH_bc8228b6673f488aa253bbcb03c80ec5/internal_photos/bs/2021/5/o/6av3mrTD2bVO40RnLTpg/51625650864-0c6436fe00-k.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T15:39:33Z\",\n" +
            "            \"content\": \"Em um jogo marcado por uma pancadaria nos minutos finais, quatro expulsões e uma arbitragem confusa, o Fluminense venceu o Boavista por 2 a 0 pela 6ª rodada da Taça Guanabara e segue 100% no Campeona… [+1232 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Ig.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"O Dia\",\n" +
            "            \"title\": \"Mauro Cezar questiona troca de Ceni por Renato Gaúcho no Flamengo: 'Por que foram buscar o que tomou de 5 a 0?' - O Dia\",\n" +
            "            \"description\": \"Rubro-Negro vive momento complicado na temporada\",\n" +
            "            \"url\": \"https://odia.ig.com.br/esporte/flamengo/2021/10/6261595-mauro-cezar-questiona-troca-de-ceni-por-renato-gaucho-no-flamengo-por-que-foram-buscar-o-que-tomou-de-5-a-0.html\",\n" +
            "            \"urlToImage\": \"https://odia.ig.com.br/_midias/jpg/2021/10/22/1200x750/1_51596255659_1ddf1de90f_o-23379331.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T15:39:28Z\",\n" +
            "            \"content\": \"Sem Gabigol e Pedro, Fla terá Diego e Vitor Gabriel como novidades contra o Fluminense\\r\\nRenato Gaúcho, que não contaria com Filipe Luís, suspenso, decidiu poupar Isla, Léo Pereira e Willian Arão\\r\\nPub… [+17 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"YouTube\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"MANCHESTER UNITED X LIVERPOOL: Abre o jogo para o clássico da Premier League - ESPN Brasil\",\n" +
            "            \"description\": \"Assista à Manchester United x Liverpool AO VIVO e gratuitamente pela #ESPNnoStarPlus. Acesse: http://dis.la/StarPlus_BRTodo o esporte AO VIVO da ESPN disponí...\",\n" +
            "            \"url\": \"https://www.youtube.com/watch?v=XAirjynWpY8\",\n" +
            "            \"urlToImage\": \"https://i.ytimg.com/vi/XAirjynWpY8/maxresdefault.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T15:38:17Z\",\n" +
            "            \"content\": null\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Meutimao.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Meu Timão\",\n" +
            "            \"title\": \"Corinthians tem quatro desfalques e quatro pendurados para duelo com o Internacional - Meu Timão\",\n" +
            "            \"description\": \"O Corinthians entra em campo neste domingo para encarar o Internacional. Para o duelo, o técnico Sylvinho tem o mesmo número de jogadores que estão pendurados e são desfalques: quatro.\",\n" +
            "            \"url\": \"https://www.meutimao.com.br/noticias-do-corinthians/395380/corinthians-tem-quatro-desfalques-e-quatro-pendurados-para-duelo-com-o-internacional\",\n" +
            "            \"urlToImage\": \"https://cdn.meutimao.com.br/_upload/noticia-share/facebook/2021/10/24/alerta-ligado-corinthians-tem-quatro-desfalques-e-quatro_9146228.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T15:37:00Z\",\n" +
            "            \"content\": \"O Corinthians entra em campo neste domingo para encarar o Internacional, às 16h, pela 28ª rodada do Brasileiro. Para o duelo, o técnico Sylvinho tem o mesmo número de jogadores que estão pendurados e… [+1058 chars]\"\n" +
            "        }\n" +
            "    ]\n" +
            "}";

    private static String categoria_tecnologia = "{\n" +
            "    \"status\": \"ok\",\n" +
            "    \"totalResults\": 70,\n" +
            "    \"articles\": [\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Rd1.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Matheus Henrique Menezes\",\n" +
            "            \"title\": \"Roberto Kovalick se descuida no Hora 1 e passa por situação constrangedora ao vivo - RD1 - Terra\",\n" +
            "            \"description\": \"Roberto Kovalick passou por uma saia justa ao vivo no Hora 1, por causa da assistente de voz do seu celular.\",\n" +
            "            \"url\": \"https://rd1.com.br/roberto-kovalick-passa-por-saia-justa-ao-vivo-com-celular-durante-o-hora-1/\",\n" +
            "            \"urlToImage\": \"https://rd1.com.br/wp-content/uploads/2021/10/20211024-roberto-kovalick.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T18:45:33Z\",\n" +
            "            \"content\": \"Roberto Kovalick passa por saia justa ao vivo com celular durante o Hora 1 (Imagem: Divulgação / Globo)\\r\\nRoberto Kovalick já comanda o Hora 1 de segunda à sexta-feira desde 2019 e tem que lidar diari… [+1705 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Seucreditodigital.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Luiz Felipe Kessler\",\n" +
            "            \"title\": \"Trigg aumentando limite a cada 3 meses, mais que o Nubank e C6 Bank - Seu Crédito Digital\",\n" +
            "            \"description\": \"Uma das principais dores dos consumidores brasileiros é a falta de limite no cartão de crédito. E, por isso, em busca disso, muitos deles procuram o Seu Cré\",\n" +
            "            \"url\": \"https://seucreditodigital.com.br/trigg-aumentando-limite-a-cada-3-meses/\",\n" +
            "            \"urlToImage\": \"https://g2y3r8w9.rocketcdn.me/wp-content/uploads/2021/10/trigg-aumentando-limite.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T18:27:12Z\",\n" +
            "            \"content\": \"Uma das principais dores dos consumidores brasileiros é a falta de limite no cartão de crédito. E, por isso, em busca disso, muitos deles procuram o Seu Crédito Digital, seja em lives como também em … [+2944 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Canaltech.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Natalie Rosa\",\n" +
            "            \"title\": \"Como a tecnologia corrigiu um erro e mudou o que sabíamos sobre este dinossauro - Canaltech\",\n" +
            "            \"description\": \"Cientistas acreditavam que determinada pegada era de um dinossauro grande e carnívoro. Agora, com a tecnologia atual, descobriram que era menor e herbívoro\",\n" +
            "            \"url\": \"https://canaltech.com.br/ciencia/como-a-tecnologia-corrigiu-um-erro-e-mudou-o-que-sabiamos-sobre-este-dinossauro-199687/\",\n" +
            "            \"urlToImage\": \"https://t.ctcdn.com.br/LtUU6sgTdFOLa-flV25WabFBNNU=/1400x788/smart/i521220.png\",\n" +
            "            \"publishedAt\": \"2021-10-24T17:30:00Z\",\n" +
            "            \"content\": \"Há mais de 60 anos, na década de 1960, paleontólogos analisaram pegadas encontradas por mineiros de carvão australianos. As marcas, que mediam mais de 30 centímetros de comprimento, fizeram os paleon… [+1786 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Canaltech.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Lu do Magalu\",\n" +
            "            \"title\": \"5 coisas incríveis que você pode fazer com o Bluetooth - Canaltech\",\n" +
            "            \"description\": \"Com o passar dos anos a conexão Bluetooth evoluiu bastante, né? Nesta matéria, conheça 5 coisas que você pode fazer com o Bluetooth do celular!\",\n" +
            "            \"url\": \"https://canaltech.com.br/smartphone/coisas-que-voce-pode-fazer-com-bluetooth/\",\n" +
            "            \"urlToImage\": \"https://t.ctcdn.com.br/r4dHGQ8EGQ6ppX_EmML_VKBXJtE=/1400x788/smart/i467458.png\",\n" +
            "            \"publishedAt\": \"2021-10-24T17:00:00Z\",\n" +
            "            \"content\": \"Desde a chegada do Bluetooth aos celulares, em 2001, essa tecnologia evoluiu bastante, né? Lembra quando o Bluetooth só conseguia transferir arquivos, músicas e parear dispositivos com seu celular? T… [+3808 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Editalconcursosbrasil.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Edital Concursos Brasil\",\n" +
            "            \"title\": \"Não instale estes aplicativos no seu celular! Entenda o porquê - Edital Concursos Brasil\",\n" +
            "            \"description\": \"Você é daqueles que vive baixando aplicativos no celular? Continue lendo para aprender a fugir de ciladas.\",\n" +
            "            \"url\": \"https://editalconcursosbrasil.com.br/noticias/2021/10/nao-instale-estes-aplicativos-no-seu-celular-entenda-o-porque/\",\n" +
            "            \"urlToImage\": \"https://editalconcursosbrasil.com.br/wp-content/uploads/2021/03/aplicativo-android.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T16:09:00Z\",\n" +
            "            \"content\": \"Você se lembra última vez que passou um dia todo sem usar aplicativos do seu celular? É muito provável, inclusive, que agora mesmo esteja lendo pelo aparelho. Embora os programas facilitem muito o di… [+2861 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"globo\",\n" +
            "                \"name\": \"Globo\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"VÍDEO: Câmeras de monitoramento flagram momento que óculos de estátua de Drummond são furtados mais uma vez - G1\",\n" +
            "            \"description\": \"Delegado titular da 13ª DP (Ipanema), Felipe Santoro, responsável pelas investigações, abriu um inquérito para apurar o caso. Desde a inauguração, em 2002, os óculos da estátua foram levados 11 vezes.\",\n" +
            "            \"url\": \"https://g1.globo.com/rj/rio-de-janeiro/noticia/2021/10/24/video-oculos-drummond.ghtml\",\n" +
            "            \"urlToImage\": \"https://s2.glbimg.com/Qx2GY6f_mBOLgtFe17z1nzxoL1I=/1200x/smart/filters:cover():strip_icc()/s03.video.glbimg.com/x720/9976890.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T15:54:36Z\",\n" +
            "            \"content\": \"Câmeras de monitoramento da Prefeitura do Rio flagraram o momento em que os óculos da estátua de Carlos Drummond de Andrade na Praia de Copacabana, na Zona Sul do Rio, foram arrancados. O delegado ti… [+2192 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Clicrbs.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Isabella Sander\",\n" +
            "            \"title\": \"Celular usado para enviar áudio que orienta contratação apenas de \\\"pessoas bonitas\\\" em rede de farmácias passará por perícia - GauchaZH\",\n" +
            "            \"description\": \"A Polícia Civil de Imbé deve receber na próxima terça-feira (26) o celular funcional utilizado por uma então funcionária da rede de farmácias São João para enviar um áudio orientando colegas a contratarem só \\\"pessoas bonitas\\\". Segundo o delegado responsável p…\",\n" +
            "            \"url\": \"https://gauchazh.clicrbs.com.br/geral/noticia/2021/10/celular-usado-para-enviar-audio-que-orienta-contratacao-apenas-de-pessoas-bonitas-em-rede-de-farmacias-passara-por-pericia-ckv5ei9n90015019mju4y73q3.html\",\n" +
            "            \"urlToImage\": \"https://www.rbsdirect.com.br/filestore/5/0/5/8/2/3/1_4e0befff2db0d75/1328505_73c2ba92beb92ce.jpg?w=1200&h=630&a=c&version=1575255600\",\n" +
            "            \"publishedAt\": \"2021-10-24T15:47:29Z\",\n" +
            "            \"content\": null\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Noticiasconcursos.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Saulo Moreira\",\n" +
            "            \"title\": \"Nubank libera o valor de R$200 para quem usar esta opção - Notícias Concursos\",\n" +
            "            \"description\": \"O Nubank libera o valor de R$200 para quem usar esta opção. A fintech liberou uma nova opção para os seus clientes, o chamado contactless. Trata-se do pagamento por aproximação com o cartão de crédito. Veja como vai funcionar.Agora, o valor limite li\",\n" +
            "            \"url\": \"https://noticiasconcursos.com.br/nubank-libera-o-valor-de-r200-para-quem-usar-esta-opcao/\",\n" +
            "            \"urlToImage\": \"https://noticiasconcursos.com.br/wp-content/uploads/2021/10/noticiasconcursos.com.br-nubank-libera-o-valor-de-r200-para-quem-usar-esta-opcao-nu.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T14:09:27Z\",\n" +
            "            \"content\": \"O Nubank libera o valor de R$200 para quem usar esta opção. A fintech liberou uma nova opção para os seus clientes, o chamado contactless. Trata-se do pagamento por aproximação com o cartão de crédit… [+2497 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Agronews.tv.br\"\n" +
            "            },\n" +
            "            \"author\": \"Redação\",\n" +
            "            \"title\": \"Pizzaria do futuro existe e está em pleno funcionamento, veja vídeo - AGRONEWS®\",\n" +
            "            \"description\": \"Pizzaria do futuro automatiza todo processo de produção com braços robóticos para achatar a massa, aplicar molho e coberturas, colocar pizzas no forno, fatiar e\",\n" +
            "            \"url\": \"https://agronews.tv.br/pizzaria-do-futuro-existe-e-esta-em-pleno-funcionamento-veja-video/\",\n" +
            "            \"urlToImage\": \"https://agronews.tv.br/wp-content/uploads/2021/10/Pizzaria-do-futuro.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T14:02:18Z\",\n" +
            "            \"content\": \"Pizzaria do futuro automatiza todo processo de produção com braços robóticos para achatar a massa, aplicar molho e coberturas, colocar pizzas no forno, fatiar e até encaixotá-los. Os robôs Pazzi são … [+2914 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Adrenaline.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Felipe Freitas\",\n" +
            "            \"title\": \"Como foi montar um PC durante a pandemia? - Adrenaline\",\n" +
            "            \"description\": \"Ou Lá e De Volta Outra Vez (nas pesquisas infrutíferas de preços)\",\n" +
            "            \"url\": \"https://adrenaline.com.br/artigos/v/71224/como-foi-montar-um-pc-durante-a-pandemia\",\n" +
            "            \"urlToImage\": \"https://adrenaline.com.br/uploads/chamadas/montagem-pc-tuf-01.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T14:00:00Z\",\n" +
            "            \"content\": \"Pouco depois do início da pandemia meu notebook morreu de vez. O HD descalibrou e eu não ia pagar, sei lá, 300 conto na assistência técnica para que eles consertassem botando um SSD de 128GB. A empre… [+8359 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"globo\",\n" +
            "                \"name\": \"Globo\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Tecnologia leva mais eficiência aos restaurantes - Época NEGÓCIOS\",\n" +
            "            \"description\": \"Plataformas, apps e sistemas automatizados diminuem custos, reduzem desperdício e ajudem no gerenciamento dos negócios\",\n" +
            "            \"url\": \"https://epocanegocios.globo.com/Empreendedorismo/noticia/2021/10/tecnologia-leva-mais-eficiencia-aos-restaurantes.html\",\n" +
            "            \"urlToImage\": \"https://s2.glbimg.com/ZLLJWeE4SKPK1qiRJmGpBjIgtGY=/512x320/smart/e.glbimg.com/og/ed/f/original/2021/10/24/go-coffee-vicente-e1601493840382.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T13:58:14Z\",\n" +
            "            \"content\": \"GoCoffe é um dos restaurantes que aderiu aos processos automatizados (Foto: Divulgacão)\\r\\nTer o próprio negócio é o sonho de muitos profissionais do setor de alimentação, que vai bem além de fogão, ba… [+2794 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Uol.com.br\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Como fazer staking e obter renda passiva com criptomoedas - Portal do Bitcoin\",\n" +
            "            \"description\": \"Staking se tornou popular nas redes Ethereum, Caradano, Polkadot, entre outras, e é uma forma de obter renda passiva com criptomoedas.\",\n" +
            "            \"url\": \"https://portaldobitcoin.uol.com.br/como-fazer-staking-e-obter-renda-passiva-com-criptomoedas/\",\n" +
            "            \"urlToImage\": \"https://portaldobitcoin.uol.com.br/wp-content/uploads/2021/04/shutterstock_300723722.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T12:35:00Z\",\n" +
            "            \"content\": \"Embora a segurança da rede Bitcoin seja garantida por meio do processo de mineração, muitas criptomoedas novas utilizam um mecanismo de consenso alternativo, conhecido como proof of stake (PoS).\\r\\nUsu… [+9759 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Adrenaline.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Raphael Giannotti\",\n" +
            "            \"title\": \"Intel Core i5-12600K é 32% mais rápido que o Ryzen 5 5600X em teste no CPU-Z - Adrenaline\",\n" +
            "            \"description\": \"CPU fica na frente até mesmo do i9-11900K e Ryzen 7 5800X\",\n" +
            "            \"url\": \"https://adrenaline.com.br/noticias/v/71660/intel-core-i5-12600k-e-32-mais-rapido-que-o-ryzen-5-5600x-em-teste-no-cpu-z\",\n" +
            "            \"urlToImage\": \"https://adrenaline.com.br/uploads/chamadas/i5-12600k-test-cpu-z(4).jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T12:00:00Z\",\n" +
            "            \"content\": \"Já mostramos diversos benchmarks diferentes dos próximos processadores da 12ª geração da Intel. Depois de bastante informações não oficiais doi9-12900K, i7-12700k e até o i5-12400, agora o i5-12600K … [+1955 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Livecoins.com.br\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Baleias movem R$10 bilhões em duas transações após correção do Bitcoin - Livecoins\",\n" +
            "            \"description\": \"Após o preço do Bitcoin voltar para a região dos 60 mil dólares depois de ter quebrado sua alta máxima de 66 mil, duas transações chamaram atenção no dia de ontem.\",\n" +
            "            \"url\": \"https://livecoins.com.br/baleias-movem-r10-bilhoes-em-duas-transacoes-apos-correcao-do-bitcoin/\",\n" +
            "            \"urlToImage\": \"https://livecoins.com.br/wp-content/uploads/2021/05/Bitcoin-Baleia.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T11:52:09Z\",\n" +
            "            \"content\": \"Após o preço do Bitcoin voltar para a região dos 60 mil dólares depois de ter quebrado sua alta máxima de 66 mil, duas transações chamaram atenção no dia de ontem.\\r\\nDuas baleias moveram cerca de 10 b… [+2499 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"globo\",\n" +
            "                \"name\": \"Globo\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Empresa lança linha de café com ingredientes funcionais e em sachê - G1\",\n" +
            "            \"description\": \"Startup está montando uma fábrica no interior de São Paulo, financiada por um investidor que achou a ideia promissora.\",\n" +
            "            \"url\": \"https://g1.globo.com/economia/pme/pequenas-empresas-grandes-negocios/noticia/2021/10/24/empresa-lanca-linha-de-cafe-com-ingredientes-funcionais-e-em-sache.ghtml\",\n" +
            "            \"urlToImage\": \"https://s2.glbimg.com/ZW_TwDhWVzjMhQM-Rd7ooHn9vcw=/1200x/smart/filters:cover():strip_icc()/s01.video.glbimg.com/x720/9976744.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T11:20:42Z\",\n" +
            "            \"content\": \"Uma startup de Ribeirão Preto, no interior de São Paulo, decidiu potencializar os nutrientes do café e investir numa linha funcional e em sachê para o café ser preparado direto na xícara. A linha lan… [+1824 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"globo\",\n" +
            "                \"name\": \"Globo\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Startup promove competições de criação de jogos e acelera negócios - G1\",\n" +
            "            \"description\": \"Projeto criou processo de incubação para transformar jogos em CNPJs e aproximar contato com investidores.\",\n" +
            "            \"url\": \"https://g1.globo.com/economia/pme/pequenas-empresas-grandes-negocios/noticia/2021/10/24/startup-promove-competicoes-de-criacao-de-jogos-e-acelera-negocios.ghtml\",\n" +
            "            \"urlToImage\": \"https://s2.glbimg.com/q-7m1DERMChboT0C74sgirRn9TU=/1200x/smart/filters:cover():strip_icc()/s01.video.glbimg.com/x720/9976740.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T11:03:00Z\",\n" +
            "            \"content\": \"Para muita gente, os games são apenas diversão. Mas, pra outros é um negócio que gera muita renda. Uma startup do Rio de Janeiro organiza competições de criação desses jogos e acelera os melhores tim… [+1529 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Adrenaline.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Raphael Giannotti\",\n" +
            "            \"title\": \"Eficiência em mineração: NVIDIA RTX A2000 chega a 42 MH/s com apenas 70W - Adrenaline\",\n" +
            "            \"description\": \"Placa de entrada voltada para workstation ainda nem foi lançada e já é considerada a melhor solução\",\n" +
            "            \"url\": \"https://adrenaline.com.br/noticias/v/71659/eficiencia-em-mineracao-nvidia-rtx-a2000-chega-a-42-mhs-com-apenas-70w\",\n" +
            "            \"urlToImage\": \"https://adrenaline.com.br/uploads/chamadas/nvidia-rtx-a2000-eficiencia-mineracao.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T11:00:00Z\",\n" +
            "            \"content\": \"A relação eficiência energética e desempenho não é só importante para um gamer com usa placa de vídeo, mas também para um minerador de criptomoedas. Dizzy Mining mostrou em seu canal no YouTube que a… [+2288 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"globo\",\n" +
            "                \"name\": \"Globo\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"‘Faraó dos Bitcoins’ oferecia seguro de vida em seu nome como garantia para atrair grandes investidores - G1\",\n" +
            "            \"description\": \"Segundo o MPF, Glaidson dos Santos colocava o investidor como beneficiário para cliente não perdesse seu investimento caso algo acontecesse com ele. Modalidade só era válida para grandes quantias.\",\n" +
            "            \"url\": \"https://g1.globo.com/rj/rio-de-janeiro/noticia/2021/10/24/farao-dos-bitcoins-oferecia-seguro-de-vida-em-seu-nome-como-garantia-para-atrair-grandes-investidores.ghtml\",\n" +
            "            \"urlToImage\": \"https://s2.glbimg.com/PcRb1AMYQuGSwhL81FjRg4Mt3lA=/1200x/smart/filters:cover():strip_icc()/i.s3.glbimg.com/v1/AUTH_59edd422c0c84a879bd37670ae4f538a/internal_photos/bs/2021/m/h/BZye6KTgei01I3m4Ioew/25pf0.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T10:05:48Z\",\n" +
            "            \"content\": \"A denúncia do Ministério Público Federal, com base em investigação da Polícia Federal na \\\"Operação Kryptos\\\"contra Glaidson Acácio dos Santos revela detalhes de como o \\\"Faraó dos Bitcoins\\\" atraía novo… [+2535 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"globo\",\n" +
            "                \"name\": \"Globo\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Mulher cai em golpe ao comprar celular na internet e tem prejuízo de mais de R$ 1 mil: 'Falou que era para o tratamento de câncer' - G1\",\n" +
            "            \"description\": \"Ela recebeu o comprovante de postagem do produto com todas as informações corretas, porém, não recebeu o aparelho. Vítima se Santos, SP, registrou um boletim de ocorrência sobre o caso.\",\n" +
            "            \"url\": \"https://g1.globo.com/sp/santos-regiao/noticia/2021/10/24/mulher-cai-em-golpe-ao-comprar-celular-na-internet-e-tem-prejuizo-de-mais-de-r-1-mil-falou-que-era-para-o-tratamento-de-cancer.ghtml\",\n" +
            "            \"urlToImage\": \"https://s2.glbimg.com/IBoT0BpjIp3jNzxQUiuWzm9dIms=/1200x/smart/filters:cover():strip_icc()/i.s3.glbimg.com/v1/AUTH_59edd422c0c84a879bd37670ae4f538a/internal_photos/bs/2021/c/R/X5MMPLQhSN2VbQbnUH9g/golpe-santos.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T09:50:21Z\",\n" +
            "            \"content\": \"Uma consultora comercial de Santos, no litoral de São Paulo, teve um prejuízo de mais de R$ 1 mil após cair em um golpe ao tentar comprar um celular pela internet. Em entrevista ao g1, a vítima conto… [+4217 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"globo\",\n" +
            "                \"name\": \"Globo\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"O empreendedor que mentiu para Steve Jobs e perdeu o negócio de sua vida - Pequenas Empresas & Grandes Negócios\",\n" +
            "            \"description\": \"Ali Parvoti, fundador da antiga iLike, tentou enganar o fundador da Apple e não se deu nada bem\",\n" +
            "            \"url\": \"https://revistapegn.globo.com/Administracao-de-empresas/noticia/2021/10/o-empreendedor-que-mentiu-para-steve-jobs-e-perdeu-o-negocio-de-sua-vida.html\",\n" +
            "            \"urlToImage\": \"https://s2.glbimg.com/FJuwPpaErJBry6t8EP6sl72B9HU=/512x320/smart/e.glbimg.com/og/ed/f/original/2019/01/17/jobs.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T09:13:14Z\",\n" +
            "            \"content\": \"Muitos especialistas dizem que negociar é uma arte. No Vale do Silício, lemas como \\\"Fake it 'till you make it\\\" (algo como \\\"minta até conseguir fazer\\\", em tradução livre) não fazem sucesso por acaso. … [+1865 chars]\"\n" +
            "        }\n" +
            "    ]\n" +
            "}";

    private static String categoria_negocios = "{\n" +
            "    \"status\": \"ok\",\n" +
            "    \"totalResults\": 70,\n" +
            "    \"articles\": [\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Rondoniagora.com\"\n" +
            "            },\n" +
            "            \"author\": \"rondoniagora.com\",\n" +
            "            \"title\": \"Porto Velho tem apagão de energia e rede da Claro também para de funcionar - Jornal Rondoniagora\",\n" +
            "            \"description\": \"Por mais de uma hora a população de Porto Velho ficou sem energia elétrica na tarde deste domingo em praticamente todas as regiões da cidade. A Energi...\",\n" +
            "            \"url\": \"https://www.rondoniagora.com/geral/porto-velho-tem-apagao-de-energia-e-rede-da-claro-tambem-para-de-funcionar\",\n" +
            "            \"urlToImage\": \"https://cdn1.rondoniagora.com/uploads/noticias/2021/10/24/3q312bxw3ko4c.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T19:16:00Z\",\n" +
            "            \"content\": \"2016 © Rondoniagora.com - Jornal Rondoniagora é uma publicação de Central de Jornalismo, Produção, Marketing e Assessoria Ltda. Todo o noticiário, incluindo vídeos, não podem ser publicados, retransm… [+182 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Oantagonista.com\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Carne enviada à China segue parada em portos - O Antagonista\",\n" +
            "            \"description\": \"A decisão de retomada das exportações depende do país asiático, que ainda mantém o veto ao produto brasileiro\",\n" +
            "            \"url\": \"https://www.oantagonista.com/brasil/carne-enviada-a-china-segue-parada-em-portos/\",\n" +
            "            \"urlToImage\": \"https://cdn.oantagonista.com/uploads/2020/07/producao-de-carne-bovina-deve-superar-o-volume-de-consumo-em-2020.jpeg\",\n" +
            "            \"publishedAt\": \"2021-10-24T18:12:28Z\",\n" +
            "            \"content\": null\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Uol.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Denise Luna\",\n" +
            "            \"title\": \"Gás de cozinha volta a subir, acumula alta de 3,5% em outubro e chega a R$ 135 - UOL\",\n" +
            "            \"description\": \"O gás de cozinha voltou a subir na semana passada, em 1,5% na comparação com a semana anterior, e no mês de outubro já acumula alta de 3,5%, segundo dados da ANP (Agência Nacional do Petróleo, Gás Natural e Biocombustíveis).O preço mais alto foi encontrad\",\n" +
            "            \"url\": \"https://economia.uol.com.br/noticias/estadao-conteudo/2021/10/24/gas-de-cozinha-volta-a-subir-e-ja-acumula-alta-de-35-em-outubro.htm\",\n" +
            "            \"urlToImage\": \"https://conteudo.imguol.com.br/c/noticias/37/2021/04/22/imagem-representativa-amp-gas-de-cozinha-como-economizar-1619125669152_v2_615x300.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T16:57:00Z\",\n" +
            "            \"content\": \"O gás de cozinha voltou a subir na semana passada, em 1,5% na comparação com a semana anterior, e no mês de outubro já acumula alta de 3,5%, segundo dados da ANP (Agência Nacional do Petróleo, Gás Na… [+2419 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Otempo.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"AFP\",\n" +
            "            \"title\": \"Empresas nos Estados Unidos procuram desesperadamente trabalhadores - O Tempo\",\n" +
            "            \"description\": \"Muitas empresas estão enfrentando problemas na contratação de novos funcionários no país norte-americano\",\n" +
            "            \"url\": \"https://www.otempo.com.br/mundo/empresas-nos-estados-unidos-procuram-desesperadamente-trabalhadores-1.2560122\",\n" +
            "            \"urlToImage\": \"https://www.otempo.com.br/image/contentid/policy:1.2366881:1596237756/pexels-photo-457563.jpeg?f=3x2&w=620&$p$f$w=b50dd0a\",\n" +
            "            \"publishedAt\": \"2021-10-24T15:34:00Z\",\n" +
            "            \"content\": \"Para manter funcionando a recém-inaugurada sala de degustação de cerveja no estado de Nova York, Peter Chekijian não tem escolha a não ser fazer seus funcionários-chave trabalharem sete dias por sema… [+2706 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Moneytimes.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Rodolfo Amstalden\",\n" +
            "            \"title\": \"Rodolfo Amstalden: Inflação bate dois dígitos em 12 meses – ganhe com isso - Money Times\",\n" +
            "            \"description\": \"No ano, o índice acumula alta de 6,90% e, nos últimos 12 meses, de 10,25% - ou seja, já é uma inflação de dois dígitos (Imagem: Marcello Casal Jr/Agência Brasil) O poder de compra do nosso dinheiro está caindo - o fantasma da inflação está nos rondando. Você …\",\n" +
            "            \"url\": \"https://www.moneytimes.com.br/rodolfo-amstalden-inflacao-bate-dois-digitos-em-12-meses-ganhe-com-isso/\",\n" +
            "            \"urlToImage\": \"https://media.moneytimes.com.br/uploads/2021/08/dinheiro-real-2.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T15:00:50Z\",\n" +
            "            \"content\": \"No ano, o índice acumula alta de 6,90% e, nos últimos 12 meses, de 10,25% – ou seja, já é uma inflação de dois dígitos (Imagem: Marcello Casal Jr/Agência Brasil)\\r\\nO poder de compra do nosso dinheiro … [+4148 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Seudinheiro.com\"\n" +
            "            },\n" +
            "            \"author\": \"Lucas Molina\",\n" +
            "            \"title\": \"'A culpa vai ser sua se você não ficar milionário': depois do dia 27, estas criptomoedas podem fazer R$5 mil se tornarem R$2 milhões; após máxima, maior potencial não está no Bitcoin, mas nas smartcoins; entenda - Seu Dinheiro\",\n" +
            "            \"description\": \"Daqui a 3 dias, um fenômeno aguardado no criptomercado pode fazer esta classe de cripto decolar a ponto de colocar a prova a frase do jovem Erik Finman, que ficou milionário aos 18 anos com bitcoin, a prova\",\n" +
            "            \"url\": \"https://www.seudinheiro.com/2021/patrocinado/empiricus/a-culpa-vai-ser-sua-se-voce-nao-ficar-milionario-depois-de-bater-maxima-maior-potencial-nao-esta-no-bitcoin-mas-nas-criptomoedas-que-podem-fazer-r5-000-tornarem-r2-milhoes-apos-27-de-outubro-brdlm058/amp\",\n" +
            "            \"urlToImage\": \"https://media.seudinheiro.com/uploads/2021/08/shutterstock_1303200502.png\",\n" +
            "            \"publishedAt\": \"2021-10-24T14:48:45Z\",\n" +
            "            \"content\": \"Já não há mais alternativas. Se o brasileiro comum deseja conseguir multiplicar expressivamente o seu patrimônio até o fim do ano, o caminho natural é direcioná-lo para aplicações em Bitcoin e cripto… [+14791 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Ig.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"iG\",\n" +
            "            \"title\": \"Mega-Sena acumula e próximo concurso deve pagar R$ 33 milhões | Economia | O Dia - O Dia\",\n" +
            "            \"description\": \"Os números sorteados foram 02 – 07 – 10 – 20 – 30 – 46\",\n" +
            "            \"url\": \"https://odia.ig.com.br/economia/2021/10/6261553-mega-sena-acumula-e-proximo-concurso-deve-pagar-rs-33-milhoes.html\",\n" +
            "            \"urlToImage\": \"https://odia.ig.com.br/_midias/jpg/2021/06/28/1200x750/1_mega_sena_11_2_450x300-22281249.jpeg\",\n" +
            "            \"publishedAt\": \"2021-10-24T14:45:42Z\",\n" +
            "            \"content\": \"Com mais de 1 bilhão de transações, Pix tem se tornado alvo de golpes; saiba como se proteger\\r\\nCom a chegada das modalidades 'saque' e 'troco', a plataforma deve vislumbrar um crescimento ainda maior… [+71 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Pr.gov.br\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Saúde retoma aplicação da 2ª dose de AstraZeneca nesta segunda para vacinados com D1 até 15 de julho - Prefeitura Municipal de Arapongas\",\n" +
            "            \"description\": \"A Prefeitura de Arapongas, por meio da Secretaria Municipal de Saúde, informa que será retomada a vacinação com a segunda dose(D2)  da vacina da As...\",\n" +
            "            \"url\": \"https://www.arapongas.pr.gov.br/9812_noticia_saude-retoma-aplicacao-da-2-dose-de-astrazeneca-nesta-segunda-para-vacinados-com-d1-ate-15-de-julho\",\n" +
            "            \"urlToImage\": \"https://www.arapongas.pr.gov.br/imagens/noticias/thumbs/ae2be93fc2255ffc63d98499890e2dcb.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T14:40:00Z\",\n" +
            "            \"content\": null\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Uol.com.br\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Mais de US$ 2 bilhões em Ethereum já foram queimados desde agosto - Portal do Bitcoin\",\n" +
            "            \"description\": \"US$ 2 bilhões de Ethereum referentes a 603.452 unidades de ETH já foram queimados pela rede desde a atualização EIP-1559\",\n" +
            "            \"url\": \"https://portaldobitcoin.uol.com.br/mais-de-us-2-bilhoes-em-ethereum-ja-foram-queimados-desde-agosto/\",\n" +
            "            \"urlToImage\": \"https://portaldobitcoin.uol.com.br/wp-content/uploads/2021/09/shutterstock_694333537.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T14:20:00Z\",\n" +
            "            \"content\": \"Cerca de US$ 2 bilhões de Ethereum referentes a 603.452 ETH já foram queimados pela rede, alimentando a fornalha que levou a criptomoeda ao seu mais recente recorde histórico. A rede começou a queima… [+1883 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"globo\",\n" +
            "                \"name\": \"Globo\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Tecnologia leva mais eficiência aos restaurantes - Época NEGÓCIOS\",\n" +
            "            \"description\": \"Plataformas, apps e sistemas automatizados diminuem custos, reduzem desperdício e ajudem no gerenciamento dos negócios\",\n" +
            "            \"url\": \"https://epocanegocios.globo.com/Empreendedorismo/noticia/2021/10/tecnologia-leva-mais-eficiencia-aos-restaurantes.html\",\n" +
            "            \"urlToImage\": \"https://s2.glbimg.com/ZLLJWeE4SKPK1qiRJmGpBjIgtGY=/512x320/smart/e.glbimg.com/og/ed/f/original/2021/10/24/go-coffee-vicente-e1601493840382.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T13:58:14Z\",\n" +
            "            \"content\": \"GoCoffe é um dos restaurantes que aderiu aos processos automatizados (Foto: Divulgacão)\\r\\nTer o próprio negócio é o sonho de muitos profissionais do setor de alimentação, que vai bem além de fogão, ba… [+2794 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"globo\",\n" +
            "                \"name\": \"Globo\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Agenda/mercados: Copom decide Selic frente a abalos no regime fiscal - Valor Econômico\",\n" +
            "            \"description\": \"Comitê de Política Monetária está sob pressão para acelerar ritmo da alta de juros no contexto de o governo estar propondo mudança no teto de gastos para acolher mais despesas e financiar o Auxílio Brasil\",\n" +
            "            \"url\": \"https://valor.globo.com/financas/noticia/2021/10/24/agendamercados-copom-decide-selic-frente-a-abalos-no-regime-fiscal.ghtml\",\n" +
            "            \"urlToImage\": \"https://s2.glbimg.com/cqUjxb7YehwboiYl8m2aZXrymWQ=/1200x/smart/filters:cover():strip_icc()/s04.video.glbimg.com/x720/9973587.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T13:45:57Z\",\n" +
            "            \"content\": \"A decisão do Comitê de Política Monetária (Copom) do Banco Central sobre a Selic é o principal destaque da última semana de outubro. O colegiado divulga na próxima quarta-feira (27), o novo patamar d… [+28 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Uol.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Smcs\",\n" +
            "            \"title\": \"Chegada de nova remessa permite antecipação de 2ª dose da Astrazeneca e Pfizer - Tribuna do Paraná\",\n" +
            "            \"description\": \"Quem for convocado para esta antecipação receberá mensagem pelo aplicativo Saúde Já Curitiba. Leia mais sobre a vacina\",\n" +
            "            \"url\": \"https://tribunapr.uol.com.br/noticias/curitiba-regiao/chegada-de-nova-remessa-permite-antecipacao-de-2a-dose-da-vacinas-da-atrazeneca-e-pfizer/\",\n" +
            "            \"urlToImage\": \"https://tribunapr.uol.com.br/wp-content/uploads/2021/10/24102526/vacina-covid-albari-rosa.jpeg\",\n" +
            "            \"publishedAt\": \"2021-10-24T13:27:00Z\",\n" +
            "            \"content\": \"Nesta semana, cerca de 23.528 mil moradores de Curitiba que receberam a primeira dose da vacina anticovid devem retornar aos pontos de vacinação para completar o ciclo de imunização com a segunda dos… [+4723 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"info-money\",\n" +
            "                \"name\": \"InfoMoney\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Mercado financeiro já vê juro de até 11% ao ano em 2022 - InfoMoney\",\n" +
            "            \"description\": \"Acompanhe Mercado financeiro já vê juro de até 11% ao ano em 2022 : gráficos, cotações, proventos, resultados, análises, notícias, fatos relevantes e mais.\",\n" +
            "            \"url\": \"https://www.infomoney.com.br/mercados/mercado-financeiro-ja-ve-juro-de-ate-11-ao-ano-em-2022/\",\n" +
            "            \"urlToImage\": \"https://www.infomoney.com.br/wp-content/uploads/2020/08/cropped-taxa-selic.jpg?quality=70\",\n" +
            "            \"publishedAt\": \"2021-10-24T12:17:00Z\",\n" +
            "            \"content\": \"O drible no teto de gastos anunciado pelo governo para conseguir elevar o valor do Auxílio Brasil, antigo Bolsa Família, de R$ 200 para R$ 400 deixou uma certeza entre os analistas: o cenário econômi… [+1949 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Sputnik International\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"CEO do Twitter prevê 'hiperinflação' em breve nos EUA e também 'no mundo' - Sputnik Brasil\",\n" +
            "            \"description\": \"Jack Dorsey, CEO do Twitter, lançou um aviso misterioso sobre o aumento de inflação nos EUA, depois que especialistas e entidades no país advertiram que esse pode ser o...\",\n" +
            "            \"url\": \"https://br.sputniknews.com/economia/2021102418157397-ceo-do-twitter-preve-hiperinflacao-em-breve-nos-eua-e-tambem-no-mundo/\",\n" +
            "            \"urlToImage\": \"https://cdnnbr1.img.sputniknews.com/images/07e5/0a/18/18157392.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T11:31:00Z\",\n" +
            "            \"content\": \"Jack Dorsey, CEO do Twitter, lançou um aviso misterioso sobre o aumento de inflação nos EUA, depois que especialistas e entidades no país advertiram que esse pode ser o caso.Jack Dorsey, cofundador d… [+2687 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"globo\",\n" +
            "                \"name\": \"Globo\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"País cria vagas, mas salário de contratação 'encolhe' em tempos de inflação e desemprego - G1\",\n" +
            "            \"description\": \"Levantamento da CNC mostra que em dois terços das 100 ocupações que mais geram vagas no país a remuneração média de admissão, quando descontada a inflação, está mais baixa do que a oferecida há 1 ano.\",\n" +
            "            \"url\": \"https://g1.globo.com/economia/noticia/2021/10/24/pais-cria-vagas-mas-salario-de-contratacao-encolhe-em-tempos-de-inflacao-e-desemprego.ghtml\",\n" +
            "            \"urlToImage\": \"https://s2.glbimg.com/VB7PECA4h4Lkpeb7NUWAP-jjt-M=/1200x/smart/filters:cover():strip_icc()/i.s3.glbimg.com/v1/AUTH_59edd422c0c84a879bd37670ae4f538a/internal_photos/bs/2021/l/W/NrBCxhTtGXidNdzWkQtw/carteira-trabalho.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T11:26:03Z\",\n" +
            "            \"content\": \"O país está criando mais empregos com carteira assinada em 2021, mas, com a disparada da inflação e com o número ainda elevado de desempregados disputando uma vaga, os salários oferecidos estão cada … [+5953 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Jovempan.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Paulo Mathias\",\n" +
            "            \"title\": \"Primeiro as eleições, a economia a gente vê depois - Jovem Pan\",\n" +
            "            \"description\": \"Com as eleições se aproximando, o governo federal tem buscado, de forma apelativa, resolver questões econômicas e sociais com medidas impulsivas, colocando a “carroça na frente dos bois”. Nesta semana, o presidente Jair Bolsonaro decidiu turbinar gastos em an…\",\n" +
            "            \"url\": \"https://jovempan.com.br/opiniao-jovem-pan/comentaristas/paulo-mathias/primeiro-as-eleicoes-a-economia-a-gente-ve-depois.html\",\n" +
            "            \"urlToImage\": \"https://jpimg.com.br/uploads/2021/10/age20211022059.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T11:00:09Z\",\n" +
            "            \"content\": \"Com as eleições se aproximando, o governo federal tem buscado, de forma apelativa, resolver questões econômicas e sociais com medidas impulsivas, colocando a carroça na frente dos bois. Nesta semana,… [+4895 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Jb.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"ECONOMIA JB\",\n" +
            "            \"title\": \"Empresas devem R$ 896,2 bilhões aos cofres públicos dos estados; conheça os 'barões da dívida' - Jornal do Brasil\",\n" +
            "            \"description\": \"Estudo elencou os 100 maiores devedores dos estados e crescimento da dívida nos últimos anos. Atlas da Dívida Ativa dos Estados Brasileiros foi destaque no Fórum Internacional Tributário 2021\",\n" +
            "            \"url\": \"https://www.jb.com.br/economia/2021/10/1033631-empresas-devem-rs-8962-bilhoes-aos-cofres-publicos-dos-estados-conheca-os-baroes-da-divida.html\",\n" +
            "            \"urlToImage\": \"https://midias.jb.com.br/_midias/jpg/2021/10/24/606x403/1_refinaria_de_manguinhos_e_a_maior_devedora_do_brasil-638421.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T10:22:57Z\",\n" +
            "            \"content\": \"O levantamento encomendado pela Fenafisco (Federação Nacional do Fisco Estadual e Distrital) aponta que a dívida ativa das empresas com os entes federados soma R$ 896,2 bilhões. Ao longo de um ano, a… [+9245 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Cnnbrasil.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Thiago Vinholes\",\n" +
            "            \"title\": \"Conheça o Boeing 787-9 Dreamliner, novo avião da Latam Airlines Brasil - CNN Brasil\",\n" +
            "            \"description\": \"Jato comercial mais avançado da Boeing, modelo possui novas tecnologias que oferecem uma experiência de voo mais confortável para os passageiros\",\n" +
            "            \"url\": \"https://www.cnnbrasil.com.br/business/conheca-o-boeing-787-9-dreamliner-novo-aviao-da-latam-airlines-brasil/\",\n" +
            "            \"urlToImage\": \"https://www.cnnbrasil.com.br/wp-content/uploads/sites/12/2021/10/B787_latam_11.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T07:30:00Z\",\n" +
            "            \"content\": \"Quem embarcar no voo da Latam Airlines Brasil de São Paulo para Madri, na Espanha, terá uma experiência de viagem diferente. A partir da segunda quinzena de dezembro, a companhia aérea usará nesse tr… [+4457 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Uol.com.br\"\n" +
            "            },\n" +
            "            \"author\": \"Fernando Barbosa\",\n" +
            "            \"title\": \"Ele entrou na Bolsa com R$ 500, e hoje dá dicas a 340 mil no YouTube - UOL\",\n" +
            "            \"description\": \"Cerca de R$ 500. Foi com essa quantia que Fabrizio Gueratto, 36, empresário e especialista em investimentos, começou a investir. Na época (o ano era 2004), as primeiras compras no mercado foram de ações da Petrobras, por um valor entre R$ 40 a R$ 50.\\\"Eu p\",\n" +
            "            \"url\": \"https://economia.uol.com.br/mais/ultimas-noticias/2021/10/24/ele-entrou-na-bolsa-com-r-500-achei-ter-encontrado-a-formula-da-coca-cola.htm\",\n" +
            "            \"urlToImage\": \"https://conteudo.imguol.com.br/c/noticias/9c/2021/08/27/fabrizio-gueratto-especialista-em-investimentos-criador-do-canal-1bilhao-educacao-financeira-1630082029883_v2_615x300.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T07:00:00Z\",\n" +
            "            \"content\": \"Cerca de R$ 500. Foi com essa quantia que Fabrizio Gueratto, 36, empresário e especialista em investimentos, começou a investir. Na época (o ano era 2004), as primeiras compras no mercado foram de aç… [+4720 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"globo\",\n" +
            "                \"name\": \"Globo\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Altas dos alimentos e do gás de cozinha impactam a venda de quentinhas - Jornal Extra\",\n" +
            "            \"description\": \"Vender quentinhas não é mais tão lucrativo, e autônomos já pensam em abandonar a atividade. Enquanto os preços dos alimentos e do botijão de gás não param de...\",\n" +
            "            \"url\": \"https://extra.globo.com/economia/financas/altas-dos-alimentos-do-gas-de-cozinha-impactam-venda-de-quentinhas-25247638.html\",\n" +
            "            \"urlToImage\": \"https://extra.globo.com/incoming/25247634-cae-cba/w976h550-PROP/elaine.jpg\",\n" +
            "            \"publishedAt\": \"2021-10-24T07:00:00Z\",\n" +
            "            \"content\": \"Vender quentinhas não é mais tão lucrativo, e autônomos já pensam em abandonar a atividade. Enquanto os preços dos alimentos e do botijão de gás não param de subir, o valor da refeição não pode aumen… [+4117 chars]\"\n" +
            "        }\n" +
            "    ]\n" +
            "}";
    public String getJson_string() {
        return this.json_string;
    }

    public static String getCategoria_entretenimento() {
        return categoria_entretenimento;
    }

    public static String getCategoria_geral() {
        return categoria_geral;
    }

    public static String getCategoria_saude() {
        return categoria_saude;
    }

    public static String getCategoria_ciencia() {
        return categoria_ciencia;
    }

    public static String getCategoria_esportes() {
        return categoria_esportes;
    }

    public static String getCategoria_tecnologia() {
        return categoria_tecnologia;
    }

    public static String getCategoria_negocios() {
        return categoria_negocios;
    }
}

