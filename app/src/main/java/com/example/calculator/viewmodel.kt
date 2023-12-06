package com.example.calculator

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

data class CalculatorState(
    val number1: Double? = null,
    val number2: Double? = null,
    val operation: String = "",
    val result: Double? = null
)

class CalculatorViewModel : ViewModel() {

    private val _state = mutableStateOf(CalculatorState())
    val state: State<CalculatorState> = _state

    fun numberPressed(number: Int) {
        if(_state.value.operation.isEmpty()) {
            // Update number1
        } else {
            // Update number2
        }
    }

    fun operationPressed(operation: String) {
        _state.value = _state.value.copy(
            operation = operation
        )
    }

    fun equalsPressed() {
        val state = CalculatorViewModel.state.value
        val currentState = _state.value
        val result = when(currentState.operation) {
            "+" -> currentState.number1?.plus(currentState.number2 ?: 0.0)
            "-" -> currentState.number1?.minus(currentState.number2 ?: 0.0)
            "x" -> currentState.number1?.times(currentState.number2 ?: 0.0)
            "/" -> currentState.number1?.div(currentState.number2 ?: 0.0)
            else -> 0.0
        }

        _state.value = currentState.copy(
            result = result
        )
    }
    fun clear() {
        _state.value = CalculatorState()
    }
    fun toggleSign() {
        val currentState = _state.value
        when {
            currentState.number1 != null -> {
                _state.value = currentState.copy(
                    number1 = currentState.number1?.times(-1)
                )
            }
            currentState.number2 != null -> {
                // Toggle number2 sign
            }
        }
    }
    fun addPercentage() {
        val currentState = _state.value
        when {
            currentState.number1 != null -> {
                _state.value = currentState.copy(
                    number1 = currentState.number1?.div(100)
                )
            }
        }
    }


    // Other operations like AC, DEL
    companion object {
        fun numberPressed(i: Int) {
        }
    }
}


@Composable
fun CalcScreen(viewModel: CalculatorViewModel) {

    val state = viewModel.state.value

    Text(
        text = state.result ?: state.number1 ?: "0"
    )
}