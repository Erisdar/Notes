package notes.exception.models

data class ConstraintViolationModel(var field: String?, var message: String?, var invalidValue: Any?)
