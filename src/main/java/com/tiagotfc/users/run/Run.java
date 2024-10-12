package com.tiagotfc.users.run;

import java.time.LocalDateTime;

//record is immutable and comes with getters and setters.
public record Run(
        Integer id,
        String title,
        LocalDateTime startedOn,
        LocalDateTime completedOn,
        Integer miles,
        Location location
) {

}
