package com.github.doubledeath.hop.api3.service;

import com.github.doubledeath.hop.api3.model.Hall;
import com.github.doubledeath.hop.api3.model.Key;
import com.github.doubledeath.hop.api3.model.Tag;
import com.github.doubledeath.hop.api3.service.form.CreateHallForm;
import com.github.doubledeath.hop.api3.service.form.UpdateHallForm;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by doubledeath on 2/21/17.
 */
public interface HallService {

    @NotNull
    Hall create(@NotNull CreateHallForm createHallForm);

    @NotNull
    Hall find(@NotNull Tag tag);

    @NotNull
    Hall update(@NotNull Tag tag, @NotNull UpdateHallForm updateHallForm);

    void delete(@NotNull Tag tag);

    void enter(@NotNull Tag hallTag, @NotNull Tag userTag, @Nullable Key key);

    void leave(@NotNull Tag hallTag, @NotNull Tag userTag);

    void ban(@NotNull Tag hallTag, @NotNull Tag userTag);

    void unban(@NotNull Tag hallTag, @NotNull Tag userTag);

    boolean isOwner(@NotNull Tag hallTag, @NotNull Tag userTag);

}