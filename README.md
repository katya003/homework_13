# Тесты для сайта uptrade.ru 

<img src="images/company.png" width="900">

## Содержание

* <a href="#tests">Что проверяют тесты?</a>
* <a href="#jenkins">Jenkins</a>
* <a href="#allure">Отчет в Allure</a>
* <a href="#telegramBot">Уведомления в Telegram bot</a>
* <a href="#video">Видео прохождения тестов</a>

---

<a id="tests"></a>
## <a name="Что проверяют тесты?">**Что проверяют тесты?**</a>

5 тестов на проверки верхнеуровнего функционала [сайта](https://uptrade.ru/), вакансия публиковалась в [Telegram](https://t.me/qa_jobs/227137). Тесты проверяют кликабельность кнопки и соответствие названий основных кнопок требованиям.

---

<a id="tools"></a>
## <a name="Jenkins:">**Jenkins:**</a>

Тесты запускаются через [Jenkins](https://jenkins.autotests.cloud/job/homework_13_jenkins_13_10_notifications/)  

<img src="images/Jenkins.png" width="900">

Для запуска тестов необходимо нажать на кнопку "Build Now". Появится прогресс бар с номером сборки тестов. 

---

<a id="allure"></a>
## <a name="Отчет в Allure">**Отчет в Allure**</a>

После окончания прогона тестов формируется отчет [Allure](https://jenkins.autotests.cloud/job/homework_13_jenkins_13_10_notifications/4/allure/)
### На скриншоте результаты отчета пяти тестов:

<img src="images/Allure.png" width="900">

Есть возможность просмотреть более детальный отчет, нажав на тестовый набор и откроются названия всех тестов

<img src="images/Allure_2.png" width="900">

При нажатии на определенный тест, раскрываются шаги теста с приложенными вложениями

<img src="images/Allure_3.png" width="900">

---

<a id="telegramBot"></a>
## <a name="Уведомления в Telegram bot">**Уведомления в Telegram bot**</a>

Для быстрой визуализации отчетности, после выполнения тестов, результат отчета дублируется в Telegram бот:
<p align="center">
    <img src="images/Telegram_bot.png">
</p>

---

<a id="video"></a>
## <a name="Видео прохождения тестов">**Видео прохождения тестов**</a>

<p align="center">
<img title="Selenoid Video" src="images/video/uptrade.gif" width="550" height="350"  alt="video">   
</p>
