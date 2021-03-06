/*
 * Singleton:   применён для класса Controller
 *                  - почему: потому что это класс, который контролирует работу приложения,
 *                      т.е. нужен только один его экземпляр
 * Factory:     применён в классах генерации параметров персоны
 *                  - почему: инкапсулирует логику генерации параметра, отдаваю сгенерированный объект параметра
 * Builder:     применён для создания объекта персоны
 *                  - почему: удобное создание объекта, позволяет улучшить читаемость кода
 * Adapter:     не применён - почему: не используются классы/методы, недоступные для изменения,
 *                  над которыми необходимо писать обертку
 * Bridge:      применён (изначально) в классе Appearance для хранения типа волос
 *                  - почему: потому что хранить объект волос вместо того, чтобы наследовать внешность с различными
 *                      типами волос удобнее (хранить, расширять, изменять)
 * Facade:      применён в классах генерации параметров персоны
 *                  - почему: потому что для генерации не требуется знать, как устроена сама генрация,
 *                      а требуется получать на выходе сгенерированный параметр
 * DTO:         применён в классе FullName - почему: данный класс предназначен для хранения и передачи данных о ФИО
 *                  сгенерированной персоны
 * Шаблон:      применён для классов генерации параметров
 *                  - почему: классы имеют одинаковый алгоритм (сначала генерация парамеров, затем сбор результата),
 *                      но у каждого класса своя реализация генерации
 */