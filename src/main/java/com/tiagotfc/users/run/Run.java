package com.tiagotfc.users.run;

import java.time.LocalDateTime;

//record is immutable and comes with getters and setters. Can not change the values
public record Run(
        Integer id,
        String title,
        LocalDateTime startedOn,
        LocalDateTime completedOn,
        Integer miles,
        Location location
) {

}
