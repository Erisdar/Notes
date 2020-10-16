package notes.exception.handlers

import notes.exception.models.ConstraintViolationModel
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus
import javax.servlet.http.HttpServletRequest
import javax.validation.ConstraintViolationException

@ControllerAdvice
class GlobalControllerExceptionHandler {
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ConstraintViolationException::class)
    @ResponseBody
    fun handleConstraintViolation(
        req: HttpServletRequest?,
        exception: ConstraintViolationException
    ): List<ConstraintViolationModel> {
        return exception.constraintViolations
            .map { ConstraintViolationModel(it.propertyPath.toString(), it.message, it.invalidValue) }
            .toCollection(ArrayList<ConstraintViolationModel>());
    }
}