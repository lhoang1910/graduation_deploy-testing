//package hoang.graduation.dev.share.utils;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.context.MessageSource;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.LocaleResolver;
//
//import javax.servlet.http.HttpServletRequest;
//import java.util.Locale;
//
//@RequiredArgsConstructor
//@Component
//public class LocalizationUtils {
//    private final MessageSource messageSource;
//    private final LocaleResolver localeResolver;
//    public String getLocalizedMessage(String messageKey, Object... params) {//spread operator
//        HttpServletRequest request = WebUtils.getCurrentRequest();
//        Locale locale = localeResolver.resolveLocale(request);
//        return messageSource.getMessage(messageKey, params, locale);
//    }
//}
