MyCommunity
===========

Aplikacja do wsparcia budżetu partycypacyjnego
==============================================

Wysoko poziomowy opis aplikacji
„My Community” to projekt aplikacji internetowej dla pracowników administracji publicznej, oraz mieszkańców miast wsi oraz innych małych społeczności. Funkcją tej aplikacji będzie wspieranie współpracy pracowników administracji oraz mieszkańców w celu realizacji wspólnej misji poprawiania warunków życia społeczeństwa. Cel ten będzie zrealizowany poprzez wspieranie procesy „Budżetu Partycypacyjnego” oraz „Inicjatywy lokalnej”
Pierwsza faza projektu opisywana w tym dokumencie polegać będzie na zgromadzeniu informacji publicznych dotyczących kolejnych edycji budżetu partycypacyjnego w różnych miastach oraz stworzenie aplikacji internetowej która pozwoli na przechowywanie, przeglądanie i uzupełnianie tych danych w ustrukturalizowanej i przejrzystej formie. 
Celem projektu jest utworzenie portalu internetowego za pośrednictwem którego użytkownicy będą mogli przeglądać i edytować dane dotyczące budżetu partycypacyjnego. Projekt przewiduje różne zakresy dostępu do danych. Użytkownicy anonimowi będą mogli uzyskać dostęp do wizualizacji danych, zarejestrowane instytucje będą miały dostęp do danych przez api, użytkownicy o większych uprawnieniach będą mieli możliwość modyfikowania i dodawania danych.

Słownik
=======

Forum – jest to instancja aplikacji Discourse zainstalowana w ramach rozwiązania
Moduł Budżetu – główny aplikacja rozwiązania pozwalająca na zarządzanie Budżetami Projektami Słownikami Harmonogramami , ankietami.
Moduł Autoryzacji– jest to dostawca usługi logowania oauth2. Zawiera 2 poziomy użytkownika Użytkownik i Administrator. Użytkownicy mogą zakładać konta w aplikacji ale nie mają wpływu na przydzielane im role i uprawnienia do aplikacji. Po zarejestrowaniu w aplikacji zostaje mu przypisana domyślna rola „Zwykły”
Harmonogram (TimeLine) – Jest to Lista Zdarzeń (Event) powiązanych z obiektem Budżet oraz Lokalizacją. Lokalizacja może mieć jeden Harmonogram w ramach Budżetu. Natomiast Budżet może mieć wiele hoarmonogramów każdy przypisany do innej lokalizacji. 
Rodzaje Użytkowników Moduł Logowania
Użytkownik – Po zarejestrowaniu zostaje domyślnie przypisana Rola „Zwykły” dająca podstawowy dostęp do Forum i Modułu Budżetu.
Administrator – Administrator ma uprawnienia do przydzielania ról do aplikacji.
Rodzaje użytkowników Moduł Budżetu.
Przewidziane są  5 rodzaje użytkowników aplikacji. Kolejne role posiadają wszystkie uprawnienia roli poprzedniej.
Anonimowy – jest to użytkownik który łączy się z aplikacją bez konieczności utworzenia konta z aplikacją. Użytkownik taki może przeglądać dane aplikacji ale nie może modyfikować ich. Jeżeli użytkownik posiada konto Twitter lub Facebook może używać social buttons do udostępniania informacji o projektach na swojej ścianie.
Zwykły – Użytkownik może logować się i dodawać wpisy do forum. Użytkownik ma także uprawnienia do wypełniania ankiet i dokonywania oceny poszczególnych etapów (Event) budżetu.
Projektodawca – Użytkownik może dodawać i edytować swoje projekty.
Operator – operator jest powiązany z lokalizacją i ma prawa do edycji tej Lokalizacji i powiązanych z nią projektów. Operator może Tworzyć Harmonogram powiązany z lokalizacją
Administrator Procesu – Jest właścicielem Organizacji oraz powiązanej z nią Hierarchii Lokalizacji. Administrator Procesu tworzy i Konfiguruje informacje na temat organizacji, tworzy i zarządza Hierarchią Lokalizacji, Przypisuje Operatorów do Lokalizacji, Tworzy Harmonogramy.
Administrator Aplikacji – osoba odpowiedzialna za konfigurację aplikacji. Ma uprawnienia do zmieniania end pointów, Konfigurowania emaila aplikacji, konfiguracji połączeń do baz danych, dodawanie wersji językowych.
Wszystkie powyższe role są zarządzane z poziomu Modułu Logowania.

Opis procesu. 
=============

Poniżej przedstawiony zostanie standardowy proces interakcji Użytkowników z aplikacją.

Anonimowy dostęp
Po połączeniu się z Modułem Budżetu użytkownik ma standardowy zestaw uprawnień do przeglądania Projektów Budżetów Lokalizacji Harmonogramów. 

Utworzenie Konta.
W momencie próby wykonania niedozwolonej operacji (na przykład dodania projektu) Użytkownik zostaje przekierowany do panelu logowania Modułu logowania. Istnieje także możliwość przekierowania do strony logowania poprzez przyciśnięcie przycisku [Login] Z poziomu panelu logowania użytkownik ma możliwość zarejestrowania konta użytkownika. Podczas rejestracji użytkownik musi podać podstawowe informacje takie jak Imie Nazwisko Adres Email i opcjonalnie numer telefonu, pesel. Podczas rejestracji użytkownikowi zostaje zaprezentowany rysunek Captcha którego celem jest zweryfikowanie czy użytkownik jest człowiekiem a nie botem. Po zarejestrowaniu konta użytkownika zostaje wysłany na adres email wiadomość z prośbą o potwierdzenia adresu email. Dopiero po potwierdzeniu adresu email użytkownik zostaje aktywowany (flaga enabled zmienia się z wartości domyślnej false na wartość true).

Plugins
=======
IntelliGrape/Grails-Image-Gallery-Plugin



