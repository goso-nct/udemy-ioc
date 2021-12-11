Раздел 1: Рассмотрение IoC и DI

Spring создаёт singleton-бины во время загрузки контекста, т.к. они являются единствинными объектами с уникальным id.
Для бина prototype по getBean (во время запроса) каждый раз создаётся новый объект.

start App --> Spring Container up -->  
beans:  
. create/reg. --> DI --> init  
app work (been used) --> app end --> context close -->  
beans (singleton):  
. destroy

destroy вызывается только у singleton, у prototype нет.
