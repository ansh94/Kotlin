package com.example.ansh.kotlinplayground.sealedclasses

/**
 * Created by ansh on 19/02/18.
 */
sealed class ScreenState {
    // Simple Error and Loading states with no data
    class Error : ScreenState()

    class Loading : ScreenState()

    // Data state is actually a data class holding some data
    data class Data(val someData: SomeData) : ScreenState()
}

fun setScreenState(screenState: ScreenState) {
    when (screenState) {
        is ScreenState.Loading -> { /* set loading state in the view */
        }
        is ScreenState.Data -> {
            /* hide loading or error states in the view and display data*/
            //sometextView.text = screenState.someData.name
        }
    }
}