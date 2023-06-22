require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Старт.

    state: Hello
        intent!: /привет
        a: Добрых вечеров

    state: Bye
        intent!: /пока
        a: Спокойных ноче

    state: NoMatch
        event!: noMatch
        a: Ваша реплика: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}
