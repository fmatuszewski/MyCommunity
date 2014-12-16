MyCommunity
===========

Aplikacja do wsparcia budżetu partycypacyjnego
==============================================

Wysoko poziomowy opis aplikacji
„My Community” to projekt aplikacji internetowej dla pracowników administracji publicznej, oraz mieszkańców miast wsi oraz innych małych społeczności. Funkcją tej aplikacji będzie wspieranie współpracy pracowników administracji oraz mieszkańców w celu realizacji wspólnej misji poprawiania warunków życia społeczeństwa. Cel ten będzie zrealizowany poprzez wspieranie procesy „Budżetu Partycypacyjnego” oraz „Inicjatywy lokalnej”
Pierwsza faza projektu opisywana w tym dokumencie polegać będzie na zgromadzeniu informacji publicznych dotyczących kolejnych edycji budżetu partycypacyjnego w różnych miastach oraz stworzenie aplikacji internetowej która pozwoli na przechowywanie, przeglądanie i uzupełnianie tych danych w ustrukturalizowanej i przejrzystej formie. 
Celem projektu jest utworzenie portalu internetowego za pośrednictwem którego użytkownicy będą mogli przeglądać i edytować dane dotyczące budżetu partycypacyjnego. Projekt przewiduje różne zakresy dostępu do danych. Użytkownicy anonimowi będą mogli uzyskać dostęp do wizualizacji danych, zarejestrowane instytucje będą miały dostęp do danych przez api, użytkownicy o większych uprawnieniach będą mieli możliwość modyfikowania i dodawania danych.



Opis procesu. 
=============

Poniżej przedstawiony zostanie standardowy proces interakcji Użytkowników z aplikacją.
Anonimowy dostęp
Po połączeniu się z Modułem Budżetu użytkownik ma standardowy zestaw uprawnień do przeglądania Projektów Budżetów Lokalizacji Harmonogramów. 
Utworzenie Konta.
W momencie próby wykonania niedozwolonej operacji (na przykład dodania projektu) Użytkownik zostaje przekierowany do panelu logowania Modułu logowania. Istnieje także możliwość przekierowania do strony logowania poprzez przyciśnięcie przycisku [Login] Z poziomu panelu logowania użytkownik ma możliwość zarejestrowania konta użytkownika. Podczas rejestracji użytkownik musi podać podstawowe informacje takie jak Imie Nazwisko Adres Email i opcjonalnie numer telefonu, pesel. Podczas rejestracji użytkownikowi zostaje zaprezentowany rysunek Captcha którego celem jest zweryfikowanie czy użytkownik jest człowiekiem a nie botem. Po zarejestrowaniu konta użytkownika zostaje wysłany na adres email wiadomość z prośbą o potwierdzenia adresu email. Dopiero po potwierdzeniu adresu email użytkownik zostaje aktywowany (flaga enabled zmienia się z wartości domyślnej false na wartość true).
