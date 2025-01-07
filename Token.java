package com.dashinterpreter.lox;

class Token {
    final TokenType type;
    final String lexeme;
    final Object literal;
    final int line;


    Token(TokenType type, String lexem, Object literal, int line) {
        this.type       = type;
        this.lexem      = lexem;
        this.literal    = literal;
        this.line       = line;
    }

    public toString() {
        return type + " " + lexem + " " + literal;
    }
}