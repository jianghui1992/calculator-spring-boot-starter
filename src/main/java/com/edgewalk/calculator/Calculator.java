package com.edgewalk.calculator;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * 对外提供服务的类
 */
public class Calculator {

	private final static ScriptEngine jse = new ScriptEngineManager().getEngineByName("JavaScript");

	public Object cal(String expression) throws ScriptException {
		return jse.eval(expression);
	}

}